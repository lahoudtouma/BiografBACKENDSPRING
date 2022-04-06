package com.example.biografbackendspring.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @GetMapping("/test")
    public void hello(){
        System.out.println("hello");
    }


}
