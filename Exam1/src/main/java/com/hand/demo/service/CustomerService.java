package com.hand.demo.service;

import com.hand.demo.domain.Customer;

public interface CustomerService {
    Long saveCustomer(Customer customer);

    Long updateCustomer(Customer customer);

    Long deleteCustomer(Long customerId);
}
