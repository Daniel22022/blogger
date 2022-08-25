package africa.semicolon.services;

import africa.semicolon.data.models.Blog;
import africa.semicolon.dto.requests.AddCommentRequest;
import africa.semicolon.dto.requests.SaveArticleRequest;
import africa.semicolon.dto.requests.SaveBlogRequest;


public interface BlogService {


    Blog saveNewBlog(SaveBlogRequest request);

    int getNoOfUsers();
    Blog addArticle(SaveArticleRequest request);

    Blog addComment(AddCommentRequest request);

    Blog save(Blog blog);
}
