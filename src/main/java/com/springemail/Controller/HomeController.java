package com.springemail.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Columbus
 */
@Controller
public class HomeController {
   static ModelAndView modelandview;
    @RequestMapping(value = {"/","welcome"}, method = RequestMethod.GET)
    public ModelAndView Welcome(ModelMap model) {
        modelandview = new ModelAndView("welcome","message","Hello, Welcome to Spring MVC Email Tutorial.");
     return modelandview;
    }  
   
}
