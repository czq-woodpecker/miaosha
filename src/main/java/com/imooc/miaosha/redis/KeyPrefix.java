package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/23 21:57
 */
public interface KeyPrefix {

    //有效期
    public int expireSeconds();

    public String getPrefix();
}
