package com.sapozhnikov.examples;

import com.sapozhnikov.examples.example2.Animal;
import com.sapozhnikov.examples.example2.Cat;
import com.sapozhnikov.examples.example2.Dog;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Examples2 {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext("com.sapozhnikov.examples");
    }

    @Test
    public void contextIsReady() {
        assertNotNull(context);
    }


    @Test
    public void getAnimal() {
        Animal animal = context.getBean(Animal.class);

        assertNotNull(animal);
        assertFalse(animal instanceof Cat);
        assertTrue(animal instanceof Dog);

        Dog dogSpringInstance = (Dog) animal;
        Dog dogHandInstance = (Dog) animal;

        assertEquals(dogSpringInstance.voice(), dogHandInstance.voice());
    }
}
