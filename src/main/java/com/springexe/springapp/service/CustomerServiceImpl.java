package com.springexe.springapp.service;

import com.springexe.springapp.domain.customer;
import com.springexe.springapp.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //adding for the availablity for customer controller use
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public customer findCustomerById(Integer id) {
        return customerRepository.findById(id).get(); //cannot use getOne
    }

    @Override
    public List<customer> listAllCustomer() {

        return customerRepository.findAll();
    }

    @Override
    public customer SaveCustomer(customer cstmr) {
        return customerRepository.save(cstmr);
    }

    @Override
    public customer ReplaceCustomer(customer cstmr, Integer id) {
        customer c = customerRepository.findById(id).get();
        c.setFstName(cstmr.getFstName());
        c.setLstName(cstmr.getLstName());
        return customerRepository.save(c);
    }

    @Override
    public void DeleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }


}
