package com.example.producerdemo.controller;

import com.example.producerdemo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class testController {

    @Autowired
    KafkaService kafkaService;
    @GetMapping
    public ResponseEntity<?> testKafkaProducer(){

        kafkaService.testKafkaProducer("test");

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
