package com.example.kafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = "topic101", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consuming message from topic100:: %s", message));
    }
}