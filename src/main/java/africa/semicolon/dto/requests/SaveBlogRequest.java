package africa.semicolon.dto.requests;

import africa.semicolon.data.models.Article;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class SaveBlogRequest {
    private String blogName;
    private String blogAuthor;
    private String blogDate;
    private String userName;
    @DBRef
    List<Article> articles = new ArrayList<>();
}
