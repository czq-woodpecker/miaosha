package com.imooc.miaosha.access;

import com.imooc.miaosha.domain.MiaoshaUser;

/**
 * @author: woodpecker
 * @Date: 2018/11/18 19:06
 * 一个用于存放线程的局部变量的容器，与线程绑定在一起，保证了线程安全。
 */
public class UserContext {
    private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<MiaoshaUser>();


    public static void setUser(MiaoshaUser user){
        userHolder.set(user);
    }

    public static MiaoshaUser getUser(){
        return userHolder.get();
    }


}
