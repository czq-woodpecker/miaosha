package com.imooc.miaosha.util;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 20:43
 */
public class MD5Util {

    /**
     * MD5加密
     * @param src
     * @return
     */
    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    private static final String salt = "1a2b3c4d";

    /**
     * 将用户输入的密码与固定salt做一次MD5加密用于网络传输
     * @param inputPass
     * @return
     */
    public static String inputPassFormPass(String inputPass){
        String string = "" + salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(string);
    }


    /**
     *将用于网络传输的密码与随机生成的salt做一次MD5加密后作为存储在数据中的秘密
     * @param formPass
     * @param salt
     * @return
     */
    public static String formPassToDBPass(String formPass,String salt){
        String string = "" + salt.charAt(0) + salt.charAt(2) + formPass + salt.charAt(5) + salt.charAt(4);
        return md5(string);
    }

    /**
     * 将用户输入的密码转化为存储在数据库中的密码
     * @param input
     * @param saltDB
     * @return
     */
    public static String inputPassToDBPass(String input,String saltDB){
        String formPass = inputPassFormPass(input);
        String dbPass = formPassToDBPass(formPass,saltDB);
        return dbPass;
    }

    public static void main(String[] args) {
//        System.out.println(inputPassFormPass("123456"));//12123456c3     d3b1294a61a07da9b49b6e22b2cbd7f9
//        System.out.println(formPassToDBPass(inputPassFormPass("123456"),"1a2b3c4d"));
//        System.out.println(inputPassToDBPass("123456","1a2b3c4d"));
    }
}
