/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springemail.services;

import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import com.springemail.model.ProductOrder;

/**
 *
 * @author Columbus
 */
@Service("MailService")
public class MailServiceImpl implements MailService {

    @Autowired
    JavaMailSender mailSender;

    @Override
    public void SendEmail(Object object) {
        ProductOrder productOrder = (ProductOrder) object;
        MimeMessagePreparator preparator = getContentWithAttachmentMessagePreparator(productOrder);
        try {
            mailSender.send(preparator);
            System.out.println("Email Sent with Attachment.");
            preparator = getContentAsInlineResourceMessagePreparator(productOrder);
            mailSender.send(preparator);
             System.out.println("Email Sent with Inline Rsources.");
        } catch (MailException e) {
            System.out.println(e.getMessage());
        }
    }

    private MimeMessagePreparator getContentWithAttachmentMessagePreparator(final ProductOrder productOrder) {
        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
                helper.setSubject("Your Order on Foody.com");
                helper.setFrom("CosterCareServive@gamil.com");
                helper.setTo(productOrder.getCustomerInfo().getEmail());
                String content = "Dear " + productOrder.getCustomerInfo().getName() + ",\nThank you for placing your order.\n" +
"                        Your OrderId is: " + productOrder.getOrderId() + ".";
                helper.setText(content);
                //Add a resource as an attachment
                helper.addAttachment("hamburger.jpg", new ClassPathResource("hamburger.jpg"));
       
                
               
            }
        };
        return preparator;
    }
    private MimeMessagePreparator getContentAsInlineResourceMessagePreparator(final ProductOrder productOrder) {
        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true,"UTF-8");
                helper.setSubject("Your Order on Foody.com");
                helper.setFrom("CosterCareServive@gamil.com");
                helper.setTo(productOrder.getCustomerInfo().getEmail());
                String content = "Dear " + productOrder.getCustomerInfo().getName() + ",\nThank you for placing your order.\n" +
"                        Your OrderId is: " + productOrder.getOrderId() + ".";
                // Add an inline resource.
                helper.setText("<html><body><p>"+content+"</p><img src='cid:hamburger' /></body></html>",true);
                helper.addInline("hamburger", new ClassPathResource("hamburger"));
       //mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(productOrder.getCustomerInfo().getEmail()));
                
                
            }
        };
        return preparator;
    }
}
