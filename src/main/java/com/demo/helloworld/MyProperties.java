package com.demo.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyProperties {

    @Value("${com.title}")
    private String title;
    @Value("${com.description}")
    private String description;


}
