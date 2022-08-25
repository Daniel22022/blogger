package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<Blog, String> {
    Blog findBlogByBlogName(String blogName);
}
