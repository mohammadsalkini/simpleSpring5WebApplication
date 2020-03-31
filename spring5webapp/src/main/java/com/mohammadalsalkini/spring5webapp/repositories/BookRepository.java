package com.mohammadalsalkini.spring5webapp.repositories;

import com.mohammadalsalkini.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author engsa
 * @project spring5webapp
 * @created 31.03.2020 - 11:30
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
