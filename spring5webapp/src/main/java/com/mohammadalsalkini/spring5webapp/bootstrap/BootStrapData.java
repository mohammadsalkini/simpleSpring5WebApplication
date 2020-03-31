package com.mohammadalsalkini.spring5webapp.bootstrap;

import com.mohammadalsalkini.spring5webapp.domain.Author;
import com.mohammadalsalkini.spring5webapp.domain.Book;
import com.mohammadalsalkini.spring5webapp.repositories.AuthorRepository;
import com.mohammadalsalkini.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Mohammad Alsalkini
 * @project spring5webapp
 * @created 31.03.2020 - 11:33
 */

@Component
public class BootStrapData implements CommandLineRunner {

    private  final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author mohammad = new Author("Mohammad", "Alsalkini");
        Book newBook = new Book("My new Book", "123321");
        mohammad.getBooks().add(newBook);
        newBook.getAuthors().add(mohammad);

        authorRepository.save(mohammad);
        bookRepository.save(newBook);

        Author mohammad2 = new Author("Mohammad2", "Alsalkini2");
        Book newBook2 = new Book("My new book 2", "12344321");

        mohammad2.getBooks().add(newBook);
        newBook2.getAuthors().add(mohammad2);

        authorRepository.save(mohammad2);
        bookRepository.save(newBook2);
    }
}
