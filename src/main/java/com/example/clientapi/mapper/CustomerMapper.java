package com.example.clientapi.mapper;

import com.example.clientapi.domain.dto.CustomerCreateDto;
import com.example.clientapi.domain.dto.CustomerDto;
import com.example.clientapi.domain.entity.Address;
import com.example.clientapi.domain.entity.Customer;
import com.example.clientapi.domain.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@RequiredArgsConstructor
public class CustomerMapper {

    @Autowired
    private final AddressRepository addressRepository;

    public List<CustomerDto> toDtos(Iterable<Customer> projects) {
        return StreamSupport.stream(projects.spliterator(), false)
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Customer toEntity(CustomerDto dto) {
        if (dto == null) {
            return null;
        } else {
            return new Customer(dto.getFirstName(), dto.getLastName(), dto.getPhoneNumber(), dto.getEmail());
        }
    }

    public Customer toEntity(long id, CustomerDto dto) {
        if (dto == null) {
            return null;
        } else {
            return new Customer(id, dto.getFirstName(), dto.getLastName(), dto.getPhoneNumber(), dto.getEmail());
        }
    }

    public Customer toEntity(CustomerCreateDto dto) {
        if (dto == null) {
            return null;
        } else {
            return new Customer(dto.getFirstName(), dto.getLastName(), dto.getPhoneNumber(), dto.getEmail());
        }
    }

    public CustomerDto toDto(Customer customer) {
        if (customer == null) {
            return null;
        } else {
            return CustomerDto.builder()
                    .id(customer.getId())
                    .firstName(customer.getFirstName())
                    .lastName(customer.getLastName())
                    .phoneNumber(customer.getPhoneNumber())
                    .email(customer.getEmail())
                    .build();
        }
    }
}
