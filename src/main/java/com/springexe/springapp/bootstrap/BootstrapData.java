package com.springexe.springapp.bootstrap;

import com.springexe.springapp.domain.customer;
import com.springexe.springapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

        //init by in-code
        customer p1 = new customer();
        p1.setFstName("Adam");
        p1.setLstName("Chan");
        customerRepository.save(p1);

        customer p2 = new customer();
        p2.setFstName("Ben");
        p2.setLstName("Koo");
        customerRepository.save(p2);

        //init by bean
        ApplicationContext context=new ClassPathXmlApplicationContext("customerbean.xml");
        int count = (int) context.getBean("count");
        System.out.println(Integer.toString(count)+" customer is going to be saved");
        String beanName = new String();
        customer b = new customer();
        for (int i=1;i<count+1;i++){
            beanName = "customer"+Integer.toString(i);
            b = (customer) context.getBean(beanName);
            customerRepository.save(b);
        }


        System.out.println("Customer Saved");
    }
}
