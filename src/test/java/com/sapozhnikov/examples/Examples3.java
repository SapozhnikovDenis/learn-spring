package com.sapozhnikov.examples;

import com.sapozhnikov.examples.example3.Cat;
import com.sapozhnikov.examples.example3.People;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class Examples3 {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext("com.sapozhnikov.examples.example3");
    }

    @Test
    public void contextIsReady() {
        assertNotNull(context);
    }


    @Test
    public void getAnimal() {
        People onePeople = (People) context.getBean("one");
        People twoPeople = (People) context.getBean("two");
        Cat cat = context.getBean(Cat.class);

        assertNotNull(onePeople);
        assertNotNull(twoPeople);
        assertNotNull(cat);
        assertEquals(onePeople.getCat(), cat);
        assertEquals(twoPeople.getCat(), cat);
        assertEquals(onePeople.getCat(), twoPeople.getCat());
    }
}
