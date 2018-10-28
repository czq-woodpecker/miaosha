package com.imooc.miaosha.controller;

import com.imooc.miaosha.domain.MiaoshaOrder;
import com.imooc.miaosha.domain.MiaoshaUser;
import com.imooc.miaosha.domain.OrderInfo;
import com.imooc.miaosha.redis.RedisService;
import com.imooc.miaosha.result.CodeMsg;
import com.imooc.miaosha.result.Result;
import com.imooc.miaosha.service.GoodsService;
import com.imooc.miaosha.service.MiaoshaService;
import com.imooc.miaosha.service.MiaoshaUserService;
import com.imooc.miaosha.service.OrderService;
import com.imooc.miaosha.vo.GoodsVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: woodpecker
 * @Date: 2018/10/4 18:53
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    MiaoshaUserService miaoshaUserService;
    @Autowired
    RedisService redisService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @RequestMapping("/info")
    @ResponseBody
    public Result<MiaoshaUser> list(Model model, MiaoshaUser user){
        return Result.success(user);
    }

}
