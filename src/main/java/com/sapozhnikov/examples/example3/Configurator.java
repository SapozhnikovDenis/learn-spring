package com.sapozhnikov.examples.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurator {

    @Bean
    public Cat crateCat() {
        return new Cat();
    }

    @Bean
    @Autowired
    public People createPeopleWith(Cat cat) {
        return new People(cat);
    }
}
