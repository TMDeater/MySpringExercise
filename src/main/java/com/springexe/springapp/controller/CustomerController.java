package com.springexe.springapp.controller;

import com.springexe.springapp.domain.customer;
import com.springexe.springapp.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL) //refer to the base url of this controller
public class CustomerController {

    public static final String BASE_URL = "api/v1/customer";

//    private final CustomerService customerservice;

//    public CustomerController(CustomerService customerservice) {
//        this.customerservice = customerservice;
//    }

//    @GetMapping //for mapping URL
//    List<customer> getAllCustomer(){
//        return customerservice.listAllCustomer();
//    }
//
//    @GetMapping("/{id}")
//    customer getCustomerById(@PathVariable Integer id){
//        return customerservice.findCustomerById(id);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public customer SaveCustomer(@RequestBody customer cstmr){
//        return customerservice.SaveCustomer(cstmr);
//    }
//
//    @PutMapping("/{id}")
//    customer replaceCustomer(@RequestBody customer newCustomer, @PathVariable Integer id) {
//        return customerservice.ReplaceCustomer(newCustomer,id);
//    }
//
//    @DeleteMapping("/{id}")
//    String deleteCustomer(@PathVariable Integer id) {
//        customerservice.DeleteCustomer(id);
//        return "id = "+Integer.toString(id)+" deleted";
//    }
}
