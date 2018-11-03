package com.sapozhnikov.examples.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("two")
public class People {

    private Cat cat;

    @Autowired
    public People(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }
}
