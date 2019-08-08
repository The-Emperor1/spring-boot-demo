package com.glodon.springboot.dao;

import com.glodon.springboot.domain.Customer;

import java.util.List;

public interface CustomerMapper {

    public void save(Customer customer);

    public List<Customer> findAll();

    public Customer findById(Integer id);

    public void update(Customer customer);

    public void delete(Integer id);
}