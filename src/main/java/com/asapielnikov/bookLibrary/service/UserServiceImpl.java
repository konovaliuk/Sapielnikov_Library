package com.asapielnikov.bookLibrary.service;

import com.asapielnikov.bookLibrary.model.AuthorBook;
import com.asapielnikov.bookLibrary.model.UsersEntity;
import com.asapielnikov.bookLibrary.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import com.asapielnikov.bookLibrary.model.Book;
import com.asapielnikov.bookLibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Implementations of {@link BookService} interface.
 */

@Slf4j

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isAdmin(UsersEntity admin) {
        return false;
    }
}