package com.example.clientapi.service;

import com.example.clientapi.domain.entity.Address;

public interface AddressService {

    Address addCustomersAddress(long customerId, Address address);

    void deleteAddress(long customerId, long addressId);
}
