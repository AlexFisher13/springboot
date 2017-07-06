package ru.fisher.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ViewController extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) { // ViewControllerRegistry - удобная функциональность из библиотеки Spring,
        // которая позволяет нам не создавать отдельные классы контроллеров для того, чтобы наши Thymeleaf странички показались пользователю.
        registry.addViewController("/welcome").setViewName("welcome");
        registry.addViewController("/").setViewName("welcome");
        registry.addViewController("/users").setViewName("users");
    }

}


