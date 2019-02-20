package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path={"/customer"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {
    @Autowired
    CustomerRepository custRepo;

    @GetMapping("")
    public List<Customer> allCustomers() {
        return custRepo.findAll();
    }

    @GetMapping("order")
    public List<Object[]> customersAndOrders() {
        return custRepo.findCustomersWithOrders();
    }
}
