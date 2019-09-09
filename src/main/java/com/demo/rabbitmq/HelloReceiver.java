package com.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @program: Spring-Boot
 * @description: HelloReceiver
 * @author: lau
 * @create: 2019-09-09 14:34
 **/
@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String message) {

        System.out.println("Receiver  : " + message);
    }

}

