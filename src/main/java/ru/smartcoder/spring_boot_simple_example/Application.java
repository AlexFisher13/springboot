package ru.smartcoder.spring_boot_simple_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*Лаконичная аннотация @SpringBootApplication скрывает под собой следующее:
@Configuration - помечает класс как источник бинов для контекста приложения(application context)
@EnableAutoConfiguration - указывает Spring Boot начать добавлять бины базируясь на настройках classpath, других бинах, и других настроечных параметрах.
@ComponentScan - указывает Spring искать компоненты, конфигурации и сервисы в пакете данного класса.
@EnableWebMvc - обычно вы добавляете эту аннотацию в ваше Spring MVC приложение, но Spring Boot добавляет ее автоматически когда видит spring-webmvc в classpath*/
public class Application {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args); //метод для запуска нашего Spring Boot приложения
    }

    /*Заметьте, что вам не пришлось ни устанавливать Tomcat ни править web.xml.
     Веб-приложение 100% написано на java и вам не нужно конфигурировать сотни xml и настраивать инфраструктуру бессонными ночами.*/

}
