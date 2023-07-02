package com.example.PaymentConfirmation.dto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="payment")
public class Payment {
    private int paymentId;
    private String payment_Location;
    private String payment_zone;
    private String payment_status;


}
