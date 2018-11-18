package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 19:03
 * 做页面缓存有效期一般比较短
 */
public class AccessKey extends BasePrefix {
    private AccessKey(int expireSeconds, String prefix) {
        super(expireSeconds,prefix);
    }

    public static AccessKey withExpire(int expireSeconds){
        return new AccessKey(expireSeconds,"accesss");
    }

}
