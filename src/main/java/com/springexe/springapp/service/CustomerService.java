package com.springexe.springapp.service;

import com.springexe.springapp.domain.customer;

import java.util.List;

public interface CustomerService {

    customer findCustomerById(Integer id);

    List<customer> listAllCustomer();

    customer SaveCustomer(customer cstmr);

    customer ReplaceCustomer(customer cstmr, Integer id);

    void DeleteCustomer(Integer id);
}
