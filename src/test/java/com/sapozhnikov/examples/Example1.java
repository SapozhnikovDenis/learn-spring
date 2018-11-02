package com.sapozhnikov.examples;

import com.sapozhnikov.examples.example1.Cat;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Example1 {

    private ApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(Cat.class);
    }

    @Test
    public void contextIsReady() {
        assertNotNull(context);
    }

    @Test
    public void getCat() {
        Cat bean = context.getBean(Cat.class);

        assertNotNull(bean);
    }

    @Test
    public void voiceCat() {
        Cat catHandInstance = new Cat();
        Cat catSpringInstance = context.getBean(Cat.class);

        assertNotNull(catHandInstance);
        assertNotNull(catSpringInstance);
        assertThat(catHandInstance, not(catSpringInstance));
        assertEquals(catHandInstance.voice(), catSpringInstance.voice());
    }
}
