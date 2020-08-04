package com.example.clientapi.domain.repository;

import com.example.clientapi.domain.entity.Address;
import com.example.clientapi.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Query("SELECT c FROM Customer c INNER JOIN Address a on c.id = a.customer where a.city = :city")
    List<Customer> findAllByAddressCity(@Param("city") String city);

    List<Customer> findAllByPhoneNumberStartsWith(String prefix);
}
