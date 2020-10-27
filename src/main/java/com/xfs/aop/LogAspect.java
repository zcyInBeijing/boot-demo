package com.xfs.aop;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author lijia
 * @description
 */
@Aspect
@Component
@Slf4j
public class LogAspect {

    /**
     * 开始时间
     */
    private Long beginTime = null;

    /**
     * 设置切入点
     */
    @Pointcut("@annotation(com.xfs.annotation.MonitorLog)")
    public void logPointCut() {

    }


    @Before("logPointCut()")
    public void doBefore(JoinPoint joinPoint) {
        beginTime = Instant.now().getLong(ChronoField.MILLI_OF_SECOND);
        Signature signature = joinPoint.getSignature();

        log.info("Execute Request class and method ::: {} ::: {}", JSON.toJSONString(signature.getDeclaringTypeName()), signature.getName());
        MethodSignature methodSignature = (MethodSignature) signature;
        String[] parameterNames = methodSignature.getParameterNames();
        Object[] args = joinPoint.getArgs();
        Map<String, Object> map = IntStream.range(0, parameterNames.length).boxed().collect(Collectors.toMap(k -> parameterNames[k], j -> args[j]));
        log.info("Execute Request params ::: {}", JSON.toJSONString(map));
    }

    /**
     * 环绕通知
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {


        // 执行方法
        Object result = point.proceed();
        // 结束时间
        long endTime = Instant.now().getLong(ChronoField.MILLI_OF_SECOND);
        // 操作时长
        long seconds = Math.subtractExact(beginTime, endTime);

        MethodSignature signature = (MethodSignature) point.getSignature();
        String[] parameterNames = signature.getParameterNames();
        Map<String, Object> map = new HashMap<String, Object>(1);
        map.put(parameterNames[0], result);
        log.info("Execute response result ::: {}", JSON.toJSONString(map));
        log.info("Execute times consuming ::: {}", seconds);
        return result;
    }


}
