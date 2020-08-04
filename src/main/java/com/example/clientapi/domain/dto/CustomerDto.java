package com.example.clientapi.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    @Getter
    private long id;

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
    @NotEmpty(message = "pohneNumber is required")
    private String phoneNumber;

    @Setter
    @Getter
    @Email
    @NotEmpty(message = "email is required")
    private String email;

    public CustomerDto(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
