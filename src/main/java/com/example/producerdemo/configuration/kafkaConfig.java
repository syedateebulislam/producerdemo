package com.example.producerdemo.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaConfig {

    @Value("kafka.topic")
    private String kafkaTopic;
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(kafkaTopic).build();
    }

}
