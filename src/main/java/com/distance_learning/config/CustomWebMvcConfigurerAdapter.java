package com.distance_learning.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebMvcConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/auth").setViewName("redirect:/auth/");
        registry.addViewController("/auth/").setViewName("forward:/auth/login.html");
        registry.addViewController("/home/teacher/course/create").setViewName("redirect:/home/teacher/course/create/");
        registry.addViewController("/home/teacher/course/create/").setViewName("forward:/home/course-create.html");
    }
}