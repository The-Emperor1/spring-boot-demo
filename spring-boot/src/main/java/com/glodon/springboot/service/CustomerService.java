package com.glodon.springboot.service;

import com.glodon.springboot.domain.Customer;
import java.util.List;

public interface CustomerService {
    public void save(Customer customer);

    public List<Customer> findAll();

    public Customer findById(Integer id);

    public void delete(Integer id);
}