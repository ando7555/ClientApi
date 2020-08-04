package com.example.clientapi.mapper;

import com.example.clientapi.domain.dto.AddressCreateDto;
import com.example.clientapi.domain.dto.AddressDto;
import com.example.clientapi.domain.entity.Address;
import com.example.clientapi.domain.entity.AddressType;
import com.example.clientapi.domain.entity.Customer;
import com.example.clientapi.domain.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@RequiredArgsConstructor
public class AddressMapper {

    @Autowired
    private final CustomerRepository customerRepository;

    public List<AddressDto> toDtos(Iterable<Address> contacts) {
        return StreamSupport.stream(contacts.spliterator(), false)
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Address toEntity(AddressDto dto) {
        if (Objects.isNull(dto)) {
            return null;
        } else {
            Optional<Customer> customer = customerRepository.findById(dto.getCustomerId());
            return customer.map(value -> new Address(AddressType.valueOf(dto.getAddressTypeColumn()),dto.getCity(), dto.getCountry(), dto.getAddressLine(),value))
                    .orElse(null);
        }    }

    public Address toEntity(long id, AddressDto dto) {
        if (Objects.isNull(dto)) {
            return null;
        } else {
            Optional<Customer> customer = customerRepository.findById(dto.getCustomerId());
            return customer.map(value -> new Address(id,AddressType.valueOf(dto.getAddressTypeColumn()),dto.getCity(), dto.getCountry(), dto.getAddressLine(),value))
                    .orElse(null);
        }

    }

    public Address toEntity(AddressCreateDto dto) {
        if (Objects.isNull(dto)) {
            return null;
        } else {
            Optional<Customer> customer = customerRepository.findById(dto.getCustomerId());
            return customer.map(value -> new Address(AddressType.valueOf(dto.getAddressTypeColumn()),dto.getCity(), dto.getCountry(), dto.getAddressLine(),value))
                    .orElse(null);
        }
    }

    public AddressDto toDto(Address address) {
        if (Objects.isNull(address)) {
            return null;
        } else {
            return AddressDto.builder()
                    .id(address.getId())
                    .addressLine(address.getAddressLine())
                    .addressTypeColumn(address.getAddressTypeColumn().toString())
                    .city(address.getCity())
                    .country(address.getCountry())
                    .customerId(address.getCustomer().getId())
                    .build();
        }
    }
}
