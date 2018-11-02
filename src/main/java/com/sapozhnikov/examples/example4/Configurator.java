package com.sapozhnikov.examples.example4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.sapozhnikov.constants.Constants.NAME_MURZIC;
import static com.sapozhnikov.constants.Constants.NAME_TUZIC;

@Configuration
public class Configurator {

    @Bean
    public Cat crateMurzic() {
        return new Cat(NAME_MURZIC);
    }

    @Bean
    public Cat crateTuzic() {
        return new Cat(NAME_TUZIC);
    }
}
