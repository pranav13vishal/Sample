package com.Pranav.RedBus.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty(message = "Email should not be empty")
    private String email;
    @NotEmpty(message = "Password should not be empty")
    private String password;
//    @NotEmpty(message = "Phone Number should not be empty")
//    private String phoneNumber;
    @NotEmpty(message = "role    should not be empty")
    private String role;
    @NotEmpty(message = "age should not be empty")
    private Integer age;
    @NotEmpty(message = "gender should not be empty")
    private String gender;
}