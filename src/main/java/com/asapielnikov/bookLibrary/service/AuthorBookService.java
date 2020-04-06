package com.asapielnikov.bookLibrary.service;

import com.asapielnikov.bookLibrary.model.Author;
import com.asapielnikov.bookLibrary.model.AuthorBook;

import java.util.HashMap;
import java.util.List;

/**
 * Service interface for {@link AuthorBook} class.
 */

public interface AuthorBookService {

    AuthorBook getById(Long id);

    void save(AuthorBook authorBook);

    void delete(Long id);

    List<AuthorBook> getAll();

    HashMap<Long, Integer> calculateBookByAuthor();

    Author findTheBestAuthor();
}
