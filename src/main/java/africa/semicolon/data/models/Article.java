package africa.semicolon.data.models;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

public class Article {
    @DBRef
    private List<Comment> comments = new ArrayList<>();


    public void setBlogName(String blogName) {
    }
}
