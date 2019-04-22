package com.springexe.springapp.bootstrap;

import com.springexe.springapp.domain.customer;
import com.springexe.springapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Load customer's data");

        customer p1 = new customer();
        p1.setFstName("Adam");
        p1.setLstName("Chan");
        customerRepository.save(p1);

        customer p2 = new customer();
        p2.setFstName("Ben");
        p2.setLstName("Koo");
        customerRepository.save(p2);

        System.out.println("Customer Saved");
    }
}
