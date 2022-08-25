package africa.semicolon.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data
@NoArgsConstructor
public class SaveArticleRequest {
    @Id
    private String id;
    private String blogName;
    private String articleTitle;
    private String articleContent;

}
