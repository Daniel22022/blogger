package africa.semicolon.data.repositories;

import africa.semicolon.data.models.Article;
import africa.semicolon.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArticleRepository extends MongoRepository<Article, String> {
    Article findArticleByComments(List<Comment> comments);

}
