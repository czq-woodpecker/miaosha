package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 18:59
 */
public abstract class BasePrefix implements KeyPrefix {
    private int expireSeconds;
    private String prefix;

    //默认0代表永不过期
    public BasePrefix(String prefix) {
        this(0, prefix);
    }

    public BasePrefix(int expireSeconds,String prefix){
        this.expireSeconds = expireSeconds;
        this.prefix = prefix;
    }

    //默认0代表永不过期
    @Override
    public int expireSeconds() {
        return expireSeconds;
    }

    //
    @Override
    public String getPrefix() {
        String className = getClass().getSimpleName();
        return className+":"+prefix;
    }
}
