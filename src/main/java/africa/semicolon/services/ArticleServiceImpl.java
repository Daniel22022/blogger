package africa.semicolon.services;

import africa.semicolon.data.models.Article;
import africa.semicolon.data.repositories.ArticleRepository;
import africa.semicolon.dto.requests.SaveArticleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;


    @Override
    public Article saveNewArticle(SaveArticleRequest request) {
        return null;
    }

    @Override
    public Article save(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public int getNoOfArticles() {
        return (int) articleRepository.count();
    }


}
