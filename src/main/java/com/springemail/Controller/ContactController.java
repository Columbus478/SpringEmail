/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Columbus
 */
@Controller
public class ContactController {    
    static ModelAndView modelAndView;
    
    @RequestMapping(value = {"/contact","contact"}, method = RequestMethod.GET)
    public ModelAndView mapView(Model model){
    modelAndView = new ModelAndView("contact","map_message","Our Location");
    return modelAndView;
    }
}
