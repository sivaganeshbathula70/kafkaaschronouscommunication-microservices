package com.example.PaymentConfirmation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentTopic {
    private String paymentmessage;
    private String paymentstatus;
    private Payment payment;
}
