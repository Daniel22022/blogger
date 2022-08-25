package africa.semicolon.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterUserRequest {
    private String email;
    private String password;
    private String username;


}