package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 19:03
 * 做页面缓存有效期一般比较短
 */
public class MiaoshaKey extends BasePrefix {
    private MiaoshaKey(String prefix) {
        super(prefix);
    }



    public static MiaoshaKey isGoodsOver = new MiaoshaKey("go");
}
