package ru.smartcoder.spring_boot_simple_example;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) { // ViewControllerRegistry - удобная функциональность из библиотеки Spring,
        // которая позволяет нам не создавать отдельные классы контроллеров для того, чтобы наши Thymeleaf странички показались пользователю.
        registry.addViewController("/base").setViewName("base");
        registry.addViewController("/").setViewName("base");
        registry.addViewController("/hello").setViewName("hello");
    }

}


