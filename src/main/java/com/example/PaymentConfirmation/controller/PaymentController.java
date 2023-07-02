package com.example.PaymentConfirmation.controller;

import com.example.PaymentConfirmation.dto.Payment;
import com.example.PaymentConfirmation.dto.PaymentTopic;
import com.example.PaymentConfirmation.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public String payments(@RequestBody Payment payment)
    {
        payment.setPaymentId(123);
        payment.setPayment_zone("NorthZone");
        payment.setPayment_status("success");
        payment.setPayment_Location("wichita");
        PaymentTopic paymentTopic = new PaymentTopic();
        paymentTopic.setPayment(payment);
        paymentTopic.setPaymentstatus("Delivered");
        paymentService.sendMessage(paymentTopic);
        return " payment done successfully...................";

    }
}
