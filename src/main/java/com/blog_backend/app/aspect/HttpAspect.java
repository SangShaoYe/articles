package com.blog_backend.app.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * Created by full on 2017/10/24.
 */
@Slf4j
//@Aspect
//@Component
public class HttpAspect {

    @Pointcut("execution(public * com.blog_backend.app.api.*.*(..))")
    public void api() {}

    @Pointcut("execution(public * com.blog_backend.app.controller.*.*(..))")
    public void controller() {}

    @Before("api() || controller()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();

        // url
        log.info("url={}", request.getRequestURL());
        // method
        log.info("method={}", request.getMethod());
        // ip
        log.info("ip={}",request.getRemoteAddr());
        // 类方法
        log.info("class_name={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
        // param
        log.info("args={}", getArgs(joinPoint));
    }

    private String getArgs(JoinPoint point) {
        String[] parameterNames = ((MethodSignature) point.getSignature()).getParameterNames();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameterNames.length; i++) {
            sb.append(parameterNames[i] + ":" + point.getArgs()[i].toString() + "; ");
        }

        return sb.toString();
    }
//    @After("log()")
//    public void doAfter() {
//        logger.info("执行了某方法。。。");
//    }

//    @AfterReturning(returning = "object",pointcut = "log()")
//    public void deAfterReturning(Object object) {
//        logger.info("response={}",object.toString());
//    }
}
