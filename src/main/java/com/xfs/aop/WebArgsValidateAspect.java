package com.xfs.aop;

import com.xfs.annotation.ParamValid;
import com.xfs.util.ValidationUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 参数验证
 **/
@Aspect
@Component
public class WebArgsValidateAspect {
    private static final Logger logger = LoggerFactory.getLogger(WebArgsValidateAspect.class);
    @Pointcut("execution(public * *..controller..*.*(..))")
    public void argValidate() {
    }

    @Before("argValidate()")
    @Order(2)
    public void doBefore(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for (int i = 0; i < parameterAnnotations.length; i++) {
            for (Annotation an : parameterAnnotations[i]) {
                if (an instanceof ParamValid) {
                    if(args[i] instanceof List){
                        List argList = (ArrayList)args[i];
                        argList.stream().forEach(obj-> ValidationUtil.validate(obj));
                    }else {
                        ValidationUtil.validate(args[i]);
                    }
                }
            }
        }
    }
}
