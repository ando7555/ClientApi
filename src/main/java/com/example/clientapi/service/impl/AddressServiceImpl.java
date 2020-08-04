package com.example.clientapi.service.impl;

import com.example.clientapi.domain.entity.Address;
import com.example.clientapi.domain.repository.AddressRepository;
import com.example.clientapi.domain.repository.CustomerRepository;
import com.example.clientapi.excpetion.ResourceNotFoundException;
import com.example.clientapi.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    @Autowired
    private final CustomerRepository customerRepository;

    @Override
    public Address addCustomersAddress(long customerId, Address address) {
        return customerRepository.findById(customerId)
                .map(customer -> {
                    address.setCustomer(customer);
                    return addressRepository.save(address);
                }).orElseThrow(() -> new ResourceNotFoundException("Customer not found with id " + customerId));
    }

    @Override
    public void deleteAddress(long customerId, long addressId) {
        Optional<Address> byIdAndCustomerId = addressRepository.findByIdAndCustomerId(addressId,customerId);
        if(byIdAndCustomerId.isPresent()){
            addressRepository.delete(byIdAndCustomerId.get());
        } else {
            throw new ResourceNotFoundException("Customer and address not found " + "customer: " + customerId + ", address: " + addressId);
        }
    }
}
