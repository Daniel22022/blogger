package africa.semicolon.controllers;

import africa.semicolon.dto.requests.LoginUserRequest;
import africa.semicolon.dto.requests.RegisterUserRequest;
import africa.semicolon.dto.responses.LoginUserResponse;
import org.springframework.http.ResponseEntity;

public interface UserController {

    ResponseEntity<?> registerUserResponse(RegisterUserRequest registerUserRequest);

    LoginUserResponse loginUser(LoginUserRequest loginUserRequest);
}
