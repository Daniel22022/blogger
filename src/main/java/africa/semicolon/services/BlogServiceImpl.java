package africa.semicolon.services;

import africa.semicolon.data.models.Article;
import africa.semicolon.data.models.Blog;
import africa.semicolon.data.repositories.BlogRepository;
import africa.semicolon.dto.requests.AddCommentRequest;
import africa.semicolon.dto.requests.SaveArticleRequest;
import africa.semicolon.dto.requests.SaveBlogRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private ArticleService articleService;


    @Override
    public Blog saveNewBlog(SaveBlogRequest request) {
        Blog blog = new Blog();
        blog.setBlogName(request.getBlogName());
        return blogRepository.save(blog);
    }

    @Override
    public int getNoOfUsers() {
        return (int) blogRepository.count();
    }

    @Override
    public Blog addArticle(SaveArticleRequest request) {
        Article newArticle = articleService.saveNewArticle(request);
        return null;
    }

    @Override
    public Blog addComment(AddCommentRequest request) {
        return null;
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }
}
