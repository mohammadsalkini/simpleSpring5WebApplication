package com.mohammadalsalkini.spring5webapp.domain;

import java.util.Set;

/**
 * @author engsa
 * @project spring5webapp
 * @created 31.03.2020 - 11:07
 */
public class Book {

    private String title;
    private String isbn;
    private Set<Author> authors;

    public Book() {
    }

    public Book(String title, String isbn, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
