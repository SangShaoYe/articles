package com.blog_backend.app.aspect;

import com.annotation.Authentication;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.osgl.util.N;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

/**
 * Created by full on 2017/10/24.
 */
@Slf4j
//@Aspect
@Component
public class AnnotationAspect {

    @Pointcut("execution(public * com.blog_backend.app.api.*.*(..))")
    public void api() {}

    @Pointcut("execution(public * com.blog_backend.app.controller.*.*(..))")
    public void controller() {}

    @Before("api() || controller()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        HttpSession session = request.getSession();
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        if (method.isAnnotationPresent(Authentication.class)) {
            Authentication annotation = method.getAnnotation(Authentication.class);
            if (N.eq(annotation.value().compareTo(Authentication.TYPE.LOGIN), 0)) { // 访问该方法需要登录

            }
        }
    }
}
