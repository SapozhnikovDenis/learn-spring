package com.sapozhnikov.examples.example2;

import org.springframework.stereotype.Component;

import static com.sapozhnikov.constants.Constants.DOG_VOICE;

@Component
public class Dog implements Animal {

    public String voice() {
        return DOG_VOICE;
    }
}
