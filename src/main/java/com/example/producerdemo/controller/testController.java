package com.example.producerdemo.controller;

import com.example.producerdemo.service.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class testController {

    @Autowired
    KafkaService kafkaService;
    @GetMapping("/test")
    public ResponseEntity<?> testKafkaProducer(){

        log.info("controller started");
        kafkaService.testKafkaProducer("test");
        log.info("controller finished");
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
