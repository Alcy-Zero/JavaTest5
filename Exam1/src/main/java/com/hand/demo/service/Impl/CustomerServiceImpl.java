package com.hand.demo.service.Impl;

import com.hand.demo.dao.CustomerDao;
import com.hand.demo.domain.Customer;
import com.hand.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Long saveCustomer(Customer customer) {
        return customerDao.saveCustomer(customer);
    }

    @Override
    public Long updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    @Override
    public Long deleteCustomer(Long customerId) {
        return customerDao.deleteCustomer(customerId);
    }
}
