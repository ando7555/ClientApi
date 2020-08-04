package com.example.clientapi.domain.dto;

import com.example.clientapi.domain.entity.AddressType;
import com.example.clientapi.validator.ValueOfEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
public class AddressCreateDto {

    @Setter
    @Getter
    @ValueOfEnum(enumClass = AddressType.class)
    @NotEmpty(message = "addressType is required")
    private String addressTypeColumn;

    @Setter
    @Getter
    @NotEmpty(message = "city is required")
    private String city;

    @Setter
    @Getter
    @NotEmpty(message = "country is required")
    private String country;

    @Setter
    @Getter
    @NotEmpty(message = "addressLine is required")
    private String addressLine;

    @Setter
    @Getter
    @NotNull(message = "customer is required")
    private Long customerId;
}
