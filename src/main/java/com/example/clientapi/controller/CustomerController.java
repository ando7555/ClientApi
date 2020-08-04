package com.example.clientapi.controller;

import com.example.clientapi.domain.dto.CustomerCreateDto;
import com.example.clientapi.domain.dto.CustomerDto;
import com.example.clientapi.domain.entity.Customer;
import com.example.clientapi.mapper.CustomerMapper;
import com.example.clientapi.service.CustomerService;
import liquibase.pro.packaged.A;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private final CustomerMapper customerMapper;

    @Autowired
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@Valid @RequestBody CustomerCreateDto customerCreateDto){
       Customer customer = customerService.createCustomer(customerMapper.toEntity(customerCreateDto));
       return ResponseEntity.ok(customerMapper.toDto(customer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@Positive @PathVariable long id){
        Customer customer = customerService.getCustomerById(id);

        if (customer == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(customerMapper.toDto(customer));
    }

    @GetMapping("/all")
    public ResponseEntity<List<CustomerDto>> getAllCustomers(){
        return ResponseEntity.ok(customerService.getAllCustomers().stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList()));
    }

    @GetMapping("/by/city")
    public ResponseEntity<List<CustomerDto>> getAllCustomersByCity(@NotEmpty @RequestParam String city){
        return ResponseEntity.ok(customerService.getAllCustomersByCity(city).stream()
                .map(customerMapper::toDto)
                .collect(Collectors.toList()));
    }

    @GetMapping("/by/phone/prefix")
    public ResponseEntity<List<CustomerDto>> getAllCustomersByPhoneNumberPrefix(@NotEmpty @RequestParam String prefix){
        return ResponseEntity.ok(customerMapper.toDtos(customerService.getAllCustomersByPhoneNumberPrefix(prefix)));
    }
}
