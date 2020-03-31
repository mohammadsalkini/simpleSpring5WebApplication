package com.mohammadalsalkini.spring5webapp.repositories;

import com.mohammadalsalkini.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mohammad Alsalkini
 * @project spring5webapp
 * @created 31.03.2020 - 11:56
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
