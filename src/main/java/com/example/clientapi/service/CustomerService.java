package com.example.clientapi.service;

import com.example.clientapi.domain.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(long id);

    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomersByCity(String city);

    List<Customer> getAllCustomersByPhoneNumberPrefix(String prefix);
}
