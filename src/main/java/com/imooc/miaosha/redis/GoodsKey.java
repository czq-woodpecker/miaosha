package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 19:03
 * 做页面缓存有效期一般比较短
 */
public class GoodsKey extends BasePrefix {
    private GoodsKey(int expireSeconds,String prefix) {
        super(expireSeconds,prefix);
    }



    public static GoodsKey getGoodsList = new GoodsKey(60,"gl");
    public static GoodsKey getGoodsDetail = new GoodsKey(60,"gd");
    public static GoodsKey getMiaoshaGoodStock = new GoodsKey(0,"gs");

}
