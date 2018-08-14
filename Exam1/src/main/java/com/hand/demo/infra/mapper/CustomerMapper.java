package com.hand.demo.infra.mapper;

import com.hand.demo.domain.entity.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CustomerMapper {

    List<Integer> login(Map<String ,Object> map);

    Long saveCustomer(Customer customer);

    Long updateCustomer(Customer customer);

    Long deleteCustomer(Long customerId);
}
