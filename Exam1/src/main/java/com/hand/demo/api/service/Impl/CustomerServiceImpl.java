package com.hand.demo.api.service.Impl;

import com.hand.demo.api.service.CustomerService;
import com.hand.demo.infra.mapper.CustomerMapper;
import com.hand.demo.domain.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Integer> login(Map<String ,Object> map) {
        return customerMapper.login(map);
    }

    @Override
    public Long saveCustomer(Customer customer) {
        return customerMapper.saveCustomer(customer);
    }

    @Override
    public Long updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public Long deleteCustomer(Long customerId) {
        return customerMapper.deleteCustomer(customerId);
    }
}
