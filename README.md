# Spring Boot simple example
The example above shows the example of hello world with
Spring Boot and Thymeleaf. Notice that instead of controllers
we use [_ViewControllerRegistry_](http://docs.spring.io/spring-framework/docs/3.2.5.RELEASE/javadoc-api/org/springframework/web/servlet/config/annotation/ViewControllerRegistry.html)
So that we don't need to worry about creating separate controller classes

This is example based on https://spring.io/guides/gs/securing-web
You can find article in russian with additional explanations here [https://smartcoderteam.github.io/spring-boot-simple-app-in-15-minutes](https://smartcoderteam.github.io/spring-boot-simple-app-in-15-minutes/)

How to run 
----------

* Import Maven project and just run _Application.java_ from your favorite IDE 
* Open [http://localhost:8080](http://localhost:8080)
* Spring Boot will do the rest.

Libraries
---------

* Spring Boot 1.4.2
* Thymeleaf for views
* Maven for build

Design
------
Just 3 classes
