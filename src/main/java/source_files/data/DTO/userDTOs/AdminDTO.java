package source_files.data.DTO.userDTOs;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AdminDTO {
    String name;
    String surname;
    String email;
    String phoneNumber;
    String password;
    double salary;
}
