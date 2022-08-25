package africa.semicolon.services;

import africa.semicolon.data.models.Article;
import africa.semicolon.dto.requests.SaveArticleRequest;
import africa.semicolon.dto.responses.SaveArticleResponse;

public interface ArticleService {
    Article saveNewArticle(SaveArticleRequest request);

    Article save(Article article);
    int getNoOfArticles();

}
