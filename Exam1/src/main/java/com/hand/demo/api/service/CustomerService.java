package com.hand.demo.api.service;

import com.hand.demo.domain.entity.Customer;

import java.util.List;
import java.util.Map;

public interface CustomerService {

    List<Integer> login(Map<String ,Object> map);

    Long saveCustomer(Customer customer);

    Long updateCustomer(Customer customer);

    Long deleteCustomer(Long customerId);
}
