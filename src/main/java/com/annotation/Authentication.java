package com.annotation;

import com.sun.deploy.security.ValidationState;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Authentication {
    TYPE value() default TYPE.LOGIN;

    public enum TYPE{LOGIN}
}
