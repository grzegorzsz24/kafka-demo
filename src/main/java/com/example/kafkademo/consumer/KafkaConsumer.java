package com.example.kafkademo.consumer;

import com.example.kafkademo.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {
    // @KafkaListener(topics = "topicNew", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consuming message from topic100:: %s", message));
    }

    @KafkaListener(topics = "topicNew", groupId = "myGroup")
    public void consumeJsonMessage(Student student) {
        log.info(String.format("Consuming message from topicNew:: %s", student.toString()));
    }
}
