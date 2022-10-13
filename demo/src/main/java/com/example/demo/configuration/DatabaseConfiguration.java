package com.example.demo.configuration;

import com.example.demo.entity.Igrac;
import com.example.demo.repository.IgracRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

    @Autowired
    private IgracRepository igracRepository;

    @Bean

    public boolean instantiate()
    {
        Igrac igrac1 = new Igrac("Jovan123", "123");
        Igrac igrac2 = new Igrac("Ivan456", "456");
        Igrac igrac3 = new Igrac("Zoran789", "789");

        return true;
    }
}