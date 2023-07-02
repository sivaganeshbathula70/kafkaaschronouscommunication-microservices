package com.example.PaymentConfirmation.service;
import com.example.PaymentConfirmation.dto.PaymentTopic;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private static final Logger log = LoggerFactory.getLogger(PaymentService.class);
    private NewTopic newTopic;
    private KafkaTemplate<String, PaymentTopic> kafkaTemplate;

    public PaymentService(NewTopic newTopic, KafkaTemplate<String, PaymentTopic> kafkaTemplate) {
        this.newTopic = newTopic;
        this.kafkaTemplate = kafkaTemplate;
    }
    //In the provided code snippet, an instance of Message is created to send a message to a Kafka topic using the kafkaTemplate
    public void sendMessage(PaymentTopic paymentTopic)
    {

        Message<PaymentTopic> paymentTopicMessage = MessageBuilder
                .withPayload(paymentTopic)
                .setHeader(KafkaHeaders.TOPIC,newTopic.name()).build();
        kafkaTemplate.send(paymentTopicMessage);
    }
}
