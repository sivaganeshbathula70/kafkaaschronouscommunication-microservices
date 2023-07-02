package com.example.adminnotification.service;

import com.example.PaymentConfirmation.dto.PaymentTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerAdnin {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerAdnin.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consumemessage(PaymentTopic paymentTopic){
        LOGGER.info(String.format("Payment confirmation received by user",paymentTopic.toString()));
    }

}
