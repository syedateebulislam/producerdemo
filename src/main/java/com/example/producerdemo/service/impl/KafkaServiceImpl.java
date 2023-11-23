package com.example.producerdemo.service.impl;

import com.example.producerdemo.Constants.Constant;
import com.example.producerdemo.service.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaServiceImpl implements KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public boolean testKafkaProducer() {
        kafkaTemplate.send(Constant.kafkaTopic,"kafka producer data - "+ Math.random());
        return true;
    }

    @Override
    public boolean testKafkaProducerWithData(String value) {
        kafkaTemplate.send(Constant.kafkaTopic,"kafka producer data - "+ value);
        log.info("kafka producer data - "+ value);
        return true;
    }

}
