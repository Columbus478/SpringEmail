/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.services;

import com.springemail.model.ProductOrder;

/**
 *
 * @author Columbus
 */
public interface OrderService {
    public void sendOrderConfirmation(ProductOrder productOrder);
}
