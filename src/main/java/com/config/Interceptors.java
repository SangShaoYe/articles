package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by full on 2017/10/24.
 */
@Configuration
public class Interceptors extends WebMvcConfigurerAdapter {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration r = registry.addInterceptor(new LoginInterceptor());
//        r.addPathPatterns("/api/**","/logout");
//        r.excludePathPatterns("/api/data/list");
//        super.addInterceptors(registry);
//    }
}
