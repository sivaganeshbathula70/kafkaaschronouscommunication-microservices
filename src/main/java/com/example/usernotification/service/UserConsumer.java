package com.example.usernotification.service;

import com.example.PaymentConfirmation.dto.PaymentTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class UserConsumer {
    private static final Logger LOGGER =  LoggerFactory.getLogger(UserConsumer.class);
    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"

    )
    public void consumemessage(PaymentTopic paymentTopic){
        LOGGER.info(String.format("Payment received successfully",paymentTopic.toString()));
    }

}
