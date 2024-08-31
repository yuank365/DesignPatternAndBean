package com.example.learnmq;

import com.rabbitmq.client.AMQP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.channels.Channel;

@SpringBootApplication
public class LearnMqApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearnMqApplication.class, args);

    }
}
