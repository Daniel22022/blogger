package africa.semicolon.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("user")
@Data
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String email;
    private String username;
    private String password;
    @DBRef
    private List<Blog> blogs = new ArrayList<>();

}
