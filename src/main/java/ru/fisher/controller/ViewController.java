package ru.fisher.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.fisher.model.User;
import ru.fisher.service.UserService;

@Configuration
public class ViewController extends WebMvcConfigurerAdapter {

    private UserService userService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) { // ViewControllerRegistry - удобная функциональность из библиотеки Spring,
        // которая позволяет нам не создавать отдельные классы контроллеров для того, чтобы наши Thymeleaf странички показались пользователю.
        registry.addViewController("/welcome").setViewName("welcome");
        registry.addViewController("/").setViewName("welcome");
        registry.addViewController("/welcome2").setViewName("welcome2");
    }


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String userList(Model model) {
        model.addAttribute("listBooks", this.userService.userList());
        return "users";
    }

}


