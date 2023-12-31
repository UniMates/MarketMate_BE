package lk.itum.MarketMate.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String userName;
    private String password;
    private String name;
    private String userRole;
}
