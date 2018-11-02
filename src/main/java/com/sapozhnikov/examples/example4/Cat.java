package com.sapozhnikov.examples.example4;

import static com.sapozhnikov.constants.Constants.CAT_VOICE;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String voice() {
        return CAT_VOICE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
