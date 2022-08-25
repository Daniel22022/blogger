package africa.semicolon.services;

import africa.semicolon.data.models.Article;
import africa.semicolon.data.models.Blog;
import africa.semicolon.data.models.User;
import africa.semicolon.data.repositories.UserRepository;
import africa.semicolon.dto.requests.LoginUserRequest;
import africa.semicolon.dto.requests.RegisterUserRequest;
import africa.semicolon.dto.requests.SaveArticleRequest;
import africa.semicolon.dto.requests.SaveBlogRequest;
import africa.semicolon.dto.responses.LoginUserResponse;
import africa.semicolon.dto.responses.RegisterUserResponse;
import africa.semicolon.dto.responses.SaveArticleResponse;
import africa.semicolon.dto.responses.SaveBlogResponse;
import africa.semicolon.exceptions.UserExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BlogService blogService;

    @Autowired
    private ArticleService articleService;
    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest registerUserRequest) {
        User user = new User();
        user.setEmail(registerUserRequest.getEmail());
        user.setUsername(registerUserRequest.getUsername());
        user.setPassword(registerUserRequest.getPassword());
        userRepository.save(user);

        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setMessage("User created successfully");
        User savedUser = userRepository.findUserByEmail(registerUserRequest.getEmail());
        if(savedUser != null)throw new UserExistException(registerUserRequest.getEmail()+"  is created already");
        return null;
    }

    @Override
    public LoginUserResponse loginUser(LoginUserRequest loginUserRequest) {
        User user = new User();
        user.setUsername(loginUserRequest.getUsername());
        user.setPassword(loginUserRequest.getPassword());
        userRepository.save(user);

        LoginUserResponse loginUserResponse = new LoginUserResponse();
        loginUserResponse.setMessage("Login Successful");
        return null;
    }

    @Override
    public int getNoOfUsers() {

        return (int)userRepository.count();
    }

    @Override
    public SaveBlogResponse saveBlog(SaveBlogRequest saveBlogResponse) {
        Blog blog = new Blog();
        blog.setBlogName(saveBlogResponse.getBlogName());
        blog.setBlogAuthor(saveBlogResponse.getBlogAuthor());
        blog.setArticles(saveBlogResponse.getArticles());
        blog.setBlogDate(saveBlogResponse.getBlogDate());
        blog.setUserName(saveBlogResponse.getUserName());
        blogService.save(blog);
        return null;
    }
//    @Override
//    public SaveBlogResponse saveBlog(SaveBlogRequest saveBlogResponse) {
//        // create a contact
//        //save contact to repository
//        //find user by email
//        //add contact to user contact list
//        //save user to repository
//        Blog blog = new Blog();
//        blog.setBlogAuthor(saveBlogResponse.getBlogAuthor());
//        blog.setBlogDate(saveBlogResponse.getBlogAuthor());
//        blog.setBlogName(saveBlogResponse.getBlogName());
//        Blog savedBlog =  blogService.saveNewBlog(blog);
//
//        User user = userRepository.findUserByEmail(saveBlogResponse.getUserEmail());
//        user.getBlogs().add(savedBlog);
//        userRepository.save(user);
//        return null;
//    }

    @Override
    public SaveArticleResponse saveArticle(SaveArticleRequest saveArticleResponse) {
        Article article = new Article();
        article.setBlogName(saveArticleResponse.getBlogName());
        articleService.save(article);
        return null;
    }


}


