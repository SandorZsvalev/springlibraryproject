package org.telran.library.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telran.library.configuration.MainAppConfig;
import org.telran.library.project.controller.UserController;


public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainAppConfig.class);

        UserController userController = context.getBean(UserController.class);

        userController.menu();


    }
}
