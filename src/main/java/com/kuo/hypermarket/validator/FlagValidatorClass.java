package com.kuo.hypermarket.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author wangfangfang
 * @Title: FlagValidatorClass
 * @Description: 状态标记校验器
 * @date 2020/4/2511:44 下午
 * @since 1.8
 */
public class FlagValidatorClass implements ConstraintValidator<FlagValidator,Integer> {
    private String[] values;

    @Override
    public void initialize(FlagValidator constraintAnnotation) {
        this.values = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = false;
        if (integer == null) {
            // 当状态为空时使用默认值
            return true;
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(String.valueOf(integer))){
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}