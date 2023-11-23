package com.example.producerdemo.service;

public interface KafkaService {

    boolean testKafkaProducer();

    boolean testKafkaProducerWithData(String value);

}
