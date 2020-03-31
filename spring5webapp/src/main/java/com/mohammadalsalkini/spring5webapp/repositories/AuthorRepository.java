package com.mohammadalsalkini.spring5webapp.repositories;

import com.mohammadalsalkini.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mohammad Alsalkini
 * @project spring5webapp
 * @created 31.03.2020 - 11:29
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
