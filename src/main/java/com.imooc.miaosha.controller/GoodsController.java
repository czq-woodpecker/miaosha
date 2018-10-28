package com.imooc.miaosha.controller;

import com.imooc.miaosha.domain.MiaoshaUser;
import com.imooc.miaosha.domain.User;
import com.imooc.miaosha.result.Result;
import com.imooc.miaosha.service.GoodsService;
import com.imooc.miaosha.service.MiaoshaUserService;
import com.imooc.miaosha.vo.GoodsVo;
import com.imooc.miaosha.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 21:02
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    MiaoshaUserService userService;
    @Autowired
    GoodsService goodsService;
    private static final Logger logger = LoggerFactory.getLogger(GoodsController.class);


    /*
        1000 * 10
        QPS:527
     */
    @RequestMapping("/to_list")
    public String list(Model model,MiaoshaUser user){
        logger.info(user+"====");
        model.addAttribute("user",user);
        //查询产品列表
        List<GoodsVo> goodsList = goodsService.listGoodsVo();
        model.addAttribute("goodsList",goodsList);
        return "goods_list";
    }


    @RequestMapping("/to_detail/{goodsId}")
    public String detail(Model model, MiaoshaUser user, @PathVariable("goodsId")long goodsId){
        model.addAttribute("user",user);
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        model.addAttribute("goods",goods);

        //
        long startAt =  goods.getStartDate().getTime();
        long endAt = goods.getEndDate().getTime();
        long now = System.currentTimeMillis();

        int miaoshaStatus = 0;
        int remainSeconds = 0;

        if(now < startAt){  //秒杀还没开始 --> 倒计时
            miaoshaStatus = 0;
            remainSeconds = (int)(startAt - now) / 1000;
        }else if(now > endAt){  //秒杀已经结束
            miaoshaStatus = 2;
            remainSeconds = -1;
        }else { //秒杀进行中
            miaoshaStatus = 1;
            remainSeconds = 0;
        }

        model.addAttribute("miaoshaStatus",miaoshaStatus);
        model.addAttribute("remainSeconds",remainSeconds);

        return "goods_detail";
    }


}
