package org.telran.library.project.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.telran.library.project.repository.HomeRepository;

public class User {

    private String name;
    private int userId;
    @Autowired
    private HomeRepository homeRepository;


    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public void setHomeRepository(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }


    public HomeRepository getHomeRepository() {
        return homeRepository;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId=" + userId +
                ", homeRepository=" + homeRepository +
                '}';
    }


}
