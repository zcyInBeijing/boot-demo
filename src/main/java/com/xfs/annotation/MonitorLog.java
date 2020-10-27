package com.xfs.annotation;

import java.lang.annotation.*;

/**
 * @author lijia
 * @description
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface MonitorLog {

    String value() default "";
}
