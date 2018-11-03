package com.sapozhnikov.examples.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.sapozhnikov.constants.Constants.NAME_MURZIC;
import static com.sapozhnikov.constants.Constants.NAME_TUZIC;

@Configuration
public class Configurator {

    @Bean(NAME_MURZIC)
    public Cat crateMurzic() {
        return new Cat(NAME_MURZIC);
    }

    @Bean(NAME_TUZIC)
    public Cat crateTuzic() {
        return new Cat(NAME_TUZIC);
    }

    @Autowired
    public void soutMurzic(@Qualifier(NAME_MURZIC) Cat cat) {
        System.out.println(cat.getName() + "     " + cat.voice());
    }

    @Autowired
    public void soutTuzic(@Qualifier(NAME_TUZIC) Cat cat) {
        System.out.println(cat.getName() + "     " + cat.voice());
    }
}
