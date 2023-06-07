package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // TODO -> só funfa com @bean
public class ConfigManoGusta {

    @Value( "${spring.name}" )
    private String name;

    @Bean
    public void nomeTest(){
        System.out.println(name);
    }

}
