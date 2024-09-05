package com.example.FirstSpringProjectAPI.configs;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //creates the beans of all return types of the methods
//Spl class while starting the application creates the bean of the return type methods.
public class RestTemplateConfig {
    @Bean //create the bean of the object and store it in spring container
    public RestTemplate CreteRestTemplate(){
        return new RestTemplateBuilder().build();
    }
}
