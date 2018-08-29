package com.imooc.miaosha.validator;

import com.imooc.miaosha.util.ValidatotUtil;
import org.thymeleaf.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author: woodpecker
 * @Date: 2018/8/26 16:00
 */
public class IsMobileValidator implements ConstraintValidator<IsMobile,String>{

    private boolean required = false;
    @Override
    public void initialize(IsMobile constrainAnnotation) {
        required = constrainAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        if(required){
            return ValidatotUtil.isMobile(value);
        }else {
            if(StringUtils.isEmpty(value)){
                return true;
            }else {
                return ValidatotUtil.isMobile(value);
            }
        }
    }
}
