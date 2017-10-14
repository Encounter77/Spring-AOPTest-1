package com.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

    @Bean(name = "Rice")
    public Food getRice(){
        return new RiceImpl();
    }

    @Bean(name = "Noodles")
    public Food getNoodles(){
        return new NoodlesImpl();
    }

    @Bean
    public EatingProcess getProcess(){
        return new EatingProcess();
    }
}
