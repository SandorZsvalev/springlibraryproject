package org.telran.library.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telran.library.configuration.MainAppConfig;
import org.telran.library.project.controller.MainController;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainAppConfig.class);

        MainController mainController = context.getBean(MainController.class);

        mainController.menu();


    }
}
