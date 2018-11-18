package com.imooc.miaosha.redis;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 19:03
 * 做页面缓存有效期一般比较短
 */
public class MiaoshaKey extends BasePrefix {


    private MiaoshaKey(int expireSeconds,String prefix) {
        super(expireSeconds,prefix);
    }

    public static MiaoshaKey isGoodsOver = new MiaoshaKey(0,"go");
    public static MiaoshaKey getMiaoshaPath = new MiaoshaKey(60,"mp");
    public static MiaoshaKey getMiaoshaVerifyCode = new MiaoshaKey(300,"vc");
}
