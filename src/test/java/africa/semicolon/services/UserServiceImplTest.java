package africa.semicolon.services;

import africa.semicolon.data.repositories.UserRepository;
import africa.semicolon.dto.requests.RegisterUserRequest;
import africa.semicolon.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Test
    public void registerUser_repositorySizeIsOneTest(){
        //given that i have a register form
        // whe i try to register a user
        // then the repository size has increased by one
        RegisterUserRequest registerUserForm = new RegisterUserRequest();
        registerUserForm.setEmail("DanielJoe");
        registerUserForm.setPassword("Jondy103");
        userService.registerUser(registerUserForm);

        assertEquals(1L, userRepository.count());

    }

}