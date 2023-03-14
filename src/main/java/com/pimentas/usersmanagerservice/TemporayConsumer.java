package com.pimentas.usersmanagerservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TemporayConsumer {

    @KafkaListener(topics = "ecommerce.compras", groupId = "ecommerce-groupId")
    public void consumer(String message) {
        System.out.println("consumed message:" + message);
    }
}
