package africa.semicolon.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document("blog")
@Data
@NoArgsConstructor
public class Blog {
    @Id
    private String id;
    private String blogName;
    private String blogAuthor;
    private String blogDate;
    private String userName;
    @DBRef
    List<Article> articles = new ArrayList<>();
}
