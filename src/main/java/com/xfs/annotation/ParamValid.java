package com.xfs.annotation;

import java.lang.annotation.*;

/**
 * 参数校验注解
 * @author zhuchunyang
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParamValid {

}
