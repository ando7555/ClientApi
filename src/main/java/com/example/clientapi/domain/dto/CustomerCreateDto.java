package com.example.clientapi.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
public class CustomerCreateDto {

    @Setter
    @Getter
    @NotEmpty(message = "fjrstName is required")
    private String firstName;

    @Setter
    @Getter
    @NotEmpty(message = "lastName is required")
    private String lastName;

    @Setter
    @Getter
    @NotEmpty(message = "phoneNumber is required")
    private String phoneNumber;

    @Setter
    @Getter
    @Email
    @NotEmpty(message = "email is required")
    private String email;
}
