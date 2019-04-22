package com.springexe.springapp.repository;

import com.springexe.springapp.domain.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<customer,Integer> {

}
