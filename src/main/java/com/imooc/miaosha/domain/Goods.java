package com.imooc.miaosha.domain;

/**
 * @author: woodpecker
 * @Date: 2018/8/29 21:02
 */

public class Goods{
    private String goodsImg;  //商品的图片
    private double goodsPrice;  //商品单价
    private String goodsTitle;  //商品标题
    private long id;  //商品ID
    private String goodsName;  //商品名称
    private String goodsDetail;  //商品的详情介绍
    private int goodsStock;  //商品库存，-1表示没有限制

    public String getGoodsImg(){
        return goodsImg;
    }
    public void setGoodsImg(String goodsImg){
        this.goodsImg = goodsImg;
    }

    public double getGoodsPrice(){
        return goodsPrice;
    }
    public void setGoodsPrice(double goodsPrice){
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsTitle(){
        return goodsTitle;
    }
    public void setGoodsTitle(String goodsTitle){
        this.goodsTitle = goodsTitle;
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String getGoodsName(){
        return goodsName;
    }
    public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }

    public String getGoodsDetail(){
        return goodsDetail;
    }
    public void setGoodsDetail(String goodsDetail){
        this.goodsDetail = goodsDetail;
    }

    public int getGoodsStock(){
        return goodsStock;
    }
    public void setGoodsStock(int goodsStock){
        this.goodsStock = goodsStock;
    }
}
