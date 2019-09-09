package com.demo.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSenderTest {

    @Autowired
    private HelloSender helloSender;
    @Autowired
    private HelloReceiver helloReceiver;

    @Test
    public void hello() throws Exception {
//        helloSender.send();
//        sendhelloReceiver.process("hello");
//        for (int i=0;i<10000;i++){
//            helloSender.send(i);
//        }
    }

}