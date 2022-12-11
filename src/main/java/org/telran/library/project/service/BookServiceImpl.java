package org.telran.library.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telran.library.project.model.Book;
import org.telran.library.project.repository.BookRepository;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllFromBooksRepository() {
        return bookRepository.getBooks();
    }

    @Override
    public boolean deleteFromBooksRepository(Book book) {
        List <Book> books = bookRepository.getBooks();
        return books.remove(book);
    }

    @Override
    public boolean addToBookRepository(Book book) {
        if (book==null){
            System.out.println("Такой книги не обнаружено");
            return false;
        }
        List <Book> books = bookRepository.getBooks();
        books.add(book);
        return true;
    }

    @Override
    public Book findBook(int isbn) {
        return bookRepository.getBooks().stream().filter(book -> book.getIsbn() == isbn).findFirst().orElse(null);
    }

    public void writeBookRepositoryToJson() {
        bookRepository.writeBookRepositoryToJson();
    }
}
