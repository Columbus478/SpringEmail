/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.model;

/**
 *
 * @author Columbus
 */
public class ProductOrder {
    private String orderId;     
    private String productName; 
    private String status;
    private CustomerInfo customerInfo;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void setCustumerInfo(CustomerInfo customerInfo){
        this.customerInfo = customerInfo;
    }
    public CustomerInfo getCustomerInfo(){
      return customerInfo;
    }

    @Override
    public String toString() {
        return "ProductOrder{" + "orderId=" + orderId + ", productName=" + productName + ", status=" + status + ", customerInfo=" + customerInfo + '}';
    }
    
}
