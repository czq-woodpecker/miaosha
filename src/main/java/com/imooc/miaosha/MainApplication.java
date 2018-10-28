package com.imooc.miaosha;

import com.imooc.miaosha.controller.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author: woodpecker
 * @Date: 2018/8/15 20:24
 */
//打war的
//@SpringBootApplication
//public class MainApplication extends SpringBootServletInitializer{
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(MainApplication.class, args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(MainApplication.class);
//    }
//}


//打jar
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainApplication.class, args);
    }
}