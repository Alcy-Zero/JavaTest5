package com.hand.demo.controller;

import com.hand.demo.DemoApplication;
import com.hand.demo.domain.Customer;
import com.hand.demo.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    protected static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/api/user",method = RequestMethod.POST)
    public void createCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer) {

        customerService.updateCustomer(customer);
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable("id") Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
