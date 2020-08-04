package com.example.clientapi.service.impl;

import com.example.clientapi.domain.entity.Customer;
import com.example.clientapi.domain.repository.CustomerRepository;
import com.example.clientapi.excpetion.ResourceNotFoundException;
import com.example.clientapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id + " customer not found"));
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomersByCity(String city) {
        return customerRepository.findAllByPhoneNumberStartsWith(city);
    }

    @Override
    public List<Customer> getAllCustomersByPhoneNumberPrefix(String prefix) {
        return customerRepository.findAllByPhoneNumberStartsWith(prefix);
    }
}
