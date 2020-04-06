package com.asapielnikov.bookLibrary.repository;

import com.asapielnikov.bookLibrary.model.Book;
import com.asapielnikov.bookLibrary.model.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link UsersEntity} class
 */



public interface UserRepository extends JpaRepository<UsersEntity, Long>{
}
