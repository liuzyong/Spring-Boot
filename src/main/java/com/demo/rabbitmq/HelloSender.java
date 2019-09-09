package com.demo.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: Spring-Boot
 * @description: HelloSender
 * @author: lau
 * @create: 2019-09-09 14:33
 **/
@Component
public class HelloSender<component> {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "rabbitmq send " + new Date()+"*******->";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context+i);
    }

}
