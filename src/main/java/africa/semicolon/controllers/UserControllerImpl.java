package africa.semicolon.controllers;

import africa.semicolon.dto.requests.LoginUserRequest;
import africa.semicolon.dto.requests.RegisterUserRequest;
import africa.semicolon.dto.requests.SaveBlogRequest;
import africa.semicolon.dto.responses.LoginUserResponse;
import africa.semicolon.dto.responses.RegisterUserResponse;
import africa.semicolon.dto.responses.SaveBlogResponse;
import africa.semicolon.exceptions.UserExistException;
import africa.semicolon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserControllerImpl implements UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<?> registerUserResponse(@RequestBody RegisterUserRequest registerUserRequest) {
        try {
            RegisterUserResponse serviceResponse = userService.registerUser(registerUserRequest);
            return new ResponseEntity<>(serviceResponse, HttpStatus.CREATED);
        } catch (UserExistException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }


    }

    @GetMapping("/user")
    public LoginUserResponse loginUser(@RequestBody LoginUserRequest loginUserRequest) {
        return userService.loginUser(loginUserRequest);
    }

    @PostMapping("/user/blog")
    public SaveBlogResponse saveBlog(@RequestBody SaveBlogRequest saveBlogRequest) {
        return userService.saveBlog(saveBlogRequest);

    }
}


