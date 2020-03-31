package com.mohammadalsalkini.spring5webapp.bootstrap;

import com.mohammadalsalkini.spring5webapp.domain.Author;
import com.mohammadalsalkini.spring5webapp.domain.Book;
import com.mohammadalsalkini.spring5webapp.domain.Publisher;
import com.mohammadalsalkini.spring5webapp.repositories.AuthorRepository;
import com.mohammadalsalkini.spring5webapp.repositories.BookRepository;
import com.mohammadalsalkini.spring5webapp.repositories.PublisherRepository;
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
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher("Publisher first name", "Publisher last name");
        publisher.setState("Vienna");
        publisherRepository.save(publisher);

        Author mohammad = new Author("Mohammad", "Alsalkini");
        Book newBook = new Book("My new Book", "123321");
        mohammad.getBooks().add(newBook);
        newBook.getAuthors().add(mohammad);
        newBook.setPublisher(publisher);
        publisher.getBooks().add(newBook);

        authorRepository.save(mohammad);
        bookRepository.save(newBook);
        publisherRepository.save(publisher);

        Author mohammad2 = new Author("Mohammad2", "Alsalkini2");
        Book newBook2 = new Book("My new book 2", "12344321");

        mohammad2.getBooks().add(newBook);
        newBook2.getAuthors().add(mohammad2);

        newBook2.setPublisher(publisher);
        publisher.getBooks().add(newBook2);

        authorRepository.save(mohammad2);
        bookRepository.save(newBook2);
        publisherRepository.save(publisher);

    }
}
