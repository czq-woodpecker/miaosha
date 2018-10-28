package com.imooc.miaosha.controller;

import com.imooc.miaosha.result.CodeMsg;
import com.imooc.miaosha.result.Result;
import com.imooc.miaosha.service.MiaoshaUserService;
import com.imooc.miaosha.util.ValidatotUtil;
import com.imooc.miaosha.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 21:02
 */

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    MiaoshaUserService userService;

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/do_login")
    @ResponseBody
    public Result<String> doLogin(HttpServletResponse response,@Valid LoginVo loginVo){
        //参数校验
//        String passInput = loginVo.getPassword();
//        String mobile = loginVo.getMobile();
//        if(StringUtils.isEmpty(passInput)){
//            return Result.error(CodeMsg.PASSWORS_EMPTY);
//        }
//        if(StringUtils.isEmpty(mobile)){
//            return Result.error(CodeMsg.MOBILE_EMPTY);
//        }
//        if(!ValidatotUtil.isMobile(mobile)){
//            return Result.error(CodeMsg.MOBILE_ERROR);
//        }
        //登录
        String token = userService.login(response,loginVo);
        return Result.success(token);
     }
}
