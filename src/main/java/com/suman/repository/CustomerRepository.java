package com.suman.repository;


import org.springframework.data.repository.CrudRepository;

import com.suman.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
