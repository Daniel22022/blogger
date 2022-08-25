package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Blog;
import africa.semicolon.data.repositories.BlogRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class BlogRepositoryTest {
    @Autowired
    private BlogRepository blogRepository;

    @Test
    public void saveBlog(){
        Blog blog = new Blog();
        var savedBlog =  blogRepository.save(blog);
        assertNotNull(savedBlog.getId());
    }


}