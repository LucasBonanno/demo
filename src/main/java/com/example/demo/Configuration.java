package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration // TODO -> só funfa com @bean
public class Configuration {
    @Value( "${NAME}" )
    private String name;
    @Bean
    public void nomeTest(){
        System.out.println("TESTE COM NOME: " + name );
    }
}
