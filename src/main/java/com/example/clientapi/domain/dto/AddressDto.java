package com.example.clientapi.domain.dto;

import com.example.clientapi.domain.entity.AddressType;
import com.example.clientapi.validator.ValueOfEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.validation.constraints.NotEmpty;


@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDto {

    @Getter
    private long id;

    @Setter
    @Getter
    @ValueOfEnum(enumClass = AddressType.class)
    @NotEmpty(message = "addressTypeColumn is required")
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
    @NotEmpty(message = "customer is required")
    @JsonBackReference
    private Long customerId;

    public AddressDto(String addressTypeColumn, String city, String country, String addressLine, Long customerId) {
        this.addressTypeColumn = addressTypeColumn;
        this.city = city;
        this.country = country;
        this.addressLine = addressLine;
        this.customerId = customerId;
    }
}
