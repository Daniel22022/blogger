package africa.semicolon.dto.responses;

import lombok.Data;

@Data
public class LoginUserResponse {
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }
}
