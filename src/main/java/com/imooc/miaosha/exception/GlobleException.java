package com.imooc.miaosha.exception;

import com.imooc.miaosha.result.CodeMsg;

/**
 * @author: woodpecker
 * @Date: 2018/8/26 16:32
 */
public class GlobleException extends RuntimeException {

    private CodeMsg cm;

    public GlobleException(CodeMsg cm){
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }
}
