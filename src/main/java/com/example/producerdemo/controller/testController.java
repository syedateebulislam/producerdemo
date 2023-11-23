package com.example.producerdemo.controller;

import com.example.producerdemo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    KafkaService kafkaService;
    @GetMapping("/test")
    public ResponseEntity<?> testKafkaProducer(){
        kafkaService.testKafkaProducer();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/testdata")
    public void testKafkaProducerWithData(@RequestBody String testData) {
        kafkaService.testKafkaProducerWithData(testData);
    }

}
