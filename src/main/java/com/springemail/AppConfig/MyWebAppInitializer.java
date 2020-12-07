/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.AppConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;

import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author Columbus
 */
public class MyWebAppInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext container) throws ServletException {
       XmlWebApplicationContext context = new XmlWebApplicationContext();
       context.setConfigLocation("spring-servlet.xml");
       ServletRegistration.Dynamic dispatcher =
        container.addServlet("dispatcher", new DispatcherServlet(context));
      dispatcher.setLoadOnStartup(1);
      dispatcher.addMapping("/"); 
    }
    
}
