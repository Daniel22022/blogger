package africa.semicolon.services;

import africa.semicolon.dto.requests.LoginUserRequest;
import africa.semicolon.dto.requests.RegisterUserRequest;
import africa.semicolon.dto.requests.SaveArticleRequest;
import africa.semicolon.dto.requests.SaveBlogRequest;
import africa.semicolon.dto.responses.LoginUserResponse;
import africa.semicolon.dto.responses.RegisterUserResponse;
import africa.semicolon.dto.responses.SaveArticleResponse;
import africa.semicolon.dto.responses.SaveBlogResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest);

    LoginUserResponse loginUser(LoginUserRequest loginUserRequest);
    int getNoOfUsers();

    SaveBlogResponse saveBlog(SaveBlogRequest saveBlogResponse);

    SaveArticleResponse saveArticle(SaveArticleRequest saveArticleResponse);
}
