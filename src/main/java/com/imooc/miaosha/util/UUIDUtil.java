package com.imooc.miaosha.util;

import java.util.UUID;

/**
 * @author: woodpecker
 * @Date: 2018/8/26 16:46
 */
public class UUIDUtil {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
