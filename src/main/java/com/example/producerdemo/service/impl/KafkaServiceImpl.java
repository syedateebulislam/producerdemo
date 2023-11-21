package com.example.producerdemo.service.impl;

import com.example.producerdemo.service.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaServiceImpl implements KafkaService {


    @Value("kafka.topic")
    private String kafkaTopic;

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public boolean testKafkaProducer(String value) {

        kafkaTemplate.send(kafkaTopic,"producer test data - "+ Math.random());
        log.info("message produced");

        return true;
    }


}
