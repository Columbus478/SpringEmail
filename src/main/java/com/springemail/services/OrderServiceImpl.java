/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springemail.model.ProductOrder;

/**
 *
 * @author Columbus
 */
@Service("OrderService")
public class OrderServiceImpl implements OrderService{
     @Autowired
    MailService mailService ;  
            
    @Override
    public void sendOrderConfirmation(ProductOrder productOrder) {
        mailService.SendEmail(productOrder);
    }
   
}
