package com.example.learnmq.MQComponent;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author yuank
 * @Package com.example.learnmq.MQconfiguration
 * @Date 2024/8/30 16:55
 * @description: 消息生产者
 */
@Component
public class MessageSender {
    private RabbitTemplate rabbitTemplate;
    private Queue queue;

    @Autowired
    public MessageSender(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }
}