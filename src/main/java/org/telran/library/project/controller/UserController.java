package org.telran.library.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.telran.library.project.model.User;
import org.telran.library.project.service.*;

import java.util.Scanner;
@org.springframework.stereotype.Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    BookService bookService;

    @Autowired
    OrderService orderService;

    @Autowired
    Controller controller;

    public void logIn (){
        System.out.println("Введите id пользователя");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int id = Integer.parseInt(String.valueOf(input));
        User user = userService.userLogIn(id);
        orderService.setUser(user);
        orderService.setHomeRepository();
        controller.menu();
    }

    private void showAllUsers(){
        userService.showAllUsers();
    }

    private void saveAndExit(){
        userService.writeUserListToJson();
        bookService.writeBookRepositoryToJson();
    }

    private int mainFirstMenu (){
        System.out.println("\n<---    ГЛАВНОЕ МЕНЮ    ---> \n" +
                "1 - показать список пользователей\n" +
                "2 - войти в систему\n" +
                "3 - сохранить изменения и выйти\n" +
                "0 - выйти из системы без сохранения");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return Integer.parseInt(String.valueOf(input.charAt(0)));
    }

    public void menu () {
        int choise = mainFirstMenu();
        while (choise != 0) {
            switch (choise) {
                case 1: {
                    showAllUsers();
                    break;
                }
                case 2: {
                    logIn();
                    break;
                }
                case 3:{
                    saveAndExit();
                    System.exit(0);
                }
            }
            choise = mainFirstMenu();
        }
    }


}
