/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Columbus
 */
@Controller
public class ProductController {
     static ModelAndView modelandview;
    @RequestMapping(value = {"/products","products"}, method = RequestMethod.GET)
    public ModelAndView products(ModelMap model){
        modelandview = new ModelAndView("products","message","Sorry, No Products yet.");
     return modelandview;
    }  
}
