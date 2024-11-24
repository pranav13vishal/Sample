package GUVI.Project.Mini1.Model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty(message = "firstName should not be empty")
    private String firstName;
    @NotEmpty(message = "lastName should not be empty")
    private String lastName;
    @NotEmpty(message = "department should not be empty")
    private String department;
    private Integer salary;
    @NotEmpty(message = "email should not be empty")
    private String email;
    @NotEmpty(message = "phoneNumber should not be empty")
    private String phoneNumber;
    @NotEmpty(message = "address should not be empty")
    private String address;
    @NotEmpty(message = "hireDate should not be empty")
    private String hireDate;
}