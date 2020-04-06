package com.asapielnikov.bookLibrary.controller;

import com.asapielnikov.bookLibrary.model.AuthorBook;
import com.asapielnikov.bookLibrary.model.Book;
import com.asapielnikov.bookLibrary.model.UsersEntity;
import com.asapielnikov.bookLibrary.service.BookService;
import com.asapielnikov.bookLibrary.service.UserService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

/**
 * REST controller for {@link UsersEntity} connected requests
 */
@Getter
@Setter
@ToString
@RestController
@RequestMapping("/api/v1/users/")
public class RestUserControllerVL {

    @PostMapping("/login")
    String login(@RequestBody UsersEntity userEntity) {
        return UserService.login(userEntity).toString();
    }

    @PostMapping("/registration")
    void registration(@RequestBody UsersEntity userEntity) {
        UserService.registration(userEntity);
    }

    @PostMapping("/getAllUsers")
    String getAllUsers(@RequestBody UsersEntity admin)
    {
        return UserService.getAll(admin).toString();
    }

    @PostMapping("/getUserById")
    String getUserById(@RequestBody UsersEntity userEntity)
    {
        return UserService.getById(userEntity).toString();
    }

}
