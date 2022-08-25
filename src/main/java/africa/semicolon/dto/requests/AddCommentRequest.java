package africa.semicolon.dto.requests;

import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class AddCommentRequest {
    @Id
    private String id;
    private String commentContent;
}
