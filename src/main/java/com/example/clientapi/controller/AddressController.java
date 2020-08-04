package com.example.clientapi.controller;

import com.example.clientapi.domain.dto.AddressCreateDto;
import com.example.clientapi.domain.dto.AddressDto;
import com.example.clientapi.domain.entity.Address;
import com.example.clientapi.mapper.AddressMapper;
import com.example.clientapi.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class AddressController {

    @Autowired
    private final AddressMapper addressMapper;

    @Autowired
    private final AddressService addressService;

    @PostMapping("/{customerId}/address")
    public ResponseEntity<AddressDto> createCustomersAddress(@Positive @PathVariable long customerId, @Valid @RequestBody AddressCreateDto addressCreateDto){
        Address address = addressService.addCustomersAddress(customerId, addressMapper.toEntity(addressCreateDto));
        return ResponseEntity.ok(addressMapper.toDto(address));
    }

    @DeleteMapping("/{customerId}/address/{addressId}")
    public ResponseEntity<Void> deleteContactById(@Positive @PathVariable  long customerId,
                                                  @Positive @PathVariable  long addressId) {
        addressService.deleteAddress(customerId, addressId);
        return ResponseEntity.noContent().build();
    }
}
