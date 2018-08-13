package com.hand.demo.dao;

import com.hand.demo.domain.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {
    Long saveCustomer(Customer customer);

    Long updateCustomer(Customer customer);

    Long deleteCustomer(Long customerId);
}
