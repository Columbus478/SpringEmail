/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.AppConfig;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author Columbus
 */
@Configuration
@EnableWebMvc
public class resourcesPath implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("**/styles/**")
                .addResourceLocations("classpath:/styles/", "D:/styles/")
                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
                
    }
}
