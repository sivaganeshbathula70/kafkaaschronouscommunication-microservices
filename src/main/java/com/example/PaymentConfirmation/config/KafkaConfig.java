package com.example.PaymentConfirmation.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
@Configuration
public class KafkaConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicname;

    @Bean
    public NewTopic topic()
    {
        return TopicBuilder.name(topicname).build();
    }

}
