package com.hand.demo.api.controller.v1;

import com.hand.demo.domain.entity.Customer;
import com.hand.demo.api.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1/customers")
public class CustomerController {
//  http://localhost:9090/v1/customers/login
//  {"name":"ROSS","password":"GREY"}
    @PostMapping("/login")
    public String login(@RequestBody Map<String ,Object> map) {
        List<Integer> list = null;
        try {
            list = customerService.login(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (list.size() == 0) {
            return "Login Fail";
        }
        return "Login Success";
    }

    @Autowired
    private CustomerService customerService;

    @PostMapping("")
    public Long createCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
        return customer.getCustomerId();
    }

    @PutMapping("")
    public Long updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
