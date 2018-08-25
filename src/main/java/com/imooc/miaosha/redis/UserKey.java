package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 19:03
 */
public class UserKey extends BasePrefix {
    private UserKey(String prefix) {
        super(prefix);
    }



    public static UserKey getById = new UserKey("id");
    public static UserKey getByName = new UserKey("name");

}
