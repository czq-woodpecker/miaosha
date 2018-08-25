package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 19:03
 */
public class OrderKey extends BasePrefix {
    public OrderKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }
}
