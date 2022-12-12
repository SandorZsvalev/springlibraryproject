package org.telran.library.project.repository;

import org.springframework.stereotype.Repository;
import org.telran.library.project.model.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HomeRepositoryImpl implements HomeRepository{

    private List <Book> usersBooks;

    private String type;

    public HomeRepositoryImpl() {
        usersBooks = new ArrayList<>();
        this.type = "HomeRepositoryImpl";
    }

    public List<Book> getUsersBooks() {
        return usersBooks;
    }

    @Override
    public String toString() {
        return "HomeRepositoryImpl{" +
                "usersBooks=" + usersBooks +
                '}';
    }
}
