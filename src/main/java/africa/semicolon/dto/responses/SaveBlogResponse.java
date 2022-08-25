package africa.semicolon.dto.responses;

import africa.semicolon.data.models.Blog;
import lombok.Data;


public class SaveBlogResponse extends Blog {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
