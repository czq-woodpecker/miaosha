package com.imooc.miaosha.util;

import org.thymeleaf.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 21:39
 */
public class ValidatotUtil {
    private static final Pattern mobile_pattern = Pattern.compile("1\\d{10}");

    public static boolean isMobile(String src){
        if(StringUtils.isEmpty(src)){
            return false;
        }
        Matcher matcher = mobile_pattern.matcher(src);
        return matcher.matches();
    }

//    public static void main(String[] args) {
//        System.out.println(isMobile("15692001467"));
//        System.out.println(isMobile("1569200146"));
//    }
}
