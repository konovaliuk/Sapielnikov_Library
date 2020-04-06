package com.asapielnikov.bookLibrary.repository;

import com.asapielnikov.bookLibrary.model.AuthorBook;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link AuthorBook} class
 */

public interface AuthorBookRepository extends JpaRepository<AuthorBook, Long> {
}






