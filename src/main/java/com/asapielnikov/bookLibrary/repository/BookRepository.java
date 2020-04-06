package com.asapielnikov.bookLibrary.repository;

import com.asapielnikov.bookLibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Book} class
 */

public interface BookRepository extends JpaRepository<Book, Long> {
}






