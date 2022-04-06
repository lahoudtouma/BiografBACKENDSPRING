package com.example.biografbackendspring;

import com.example.biografbackendspring.Staff.Staff;
import com.example.biografbackendspring.Staff.StaffDAO;
import com.example.biografbackendspring.Staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BiografBackendspringApplication {

    @Autowired
    StaffService staffService;

    public static void main(String[] args) {
        SpringApplication.run(BiografBackendspringApplication.class, args);




    }

    @GetMapping("/addStaff")
    public static void addStaff(@RequestParam(value = "adminName") String name, @RequestParam(value = "phone") String phone, @RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        System.out.println("name: " +  name);
        System.out.println("phone: " + phone);
        System.out.println("Username: " + username);
        System.out.println("password: " + password);
        ApplicationContext context = SpringApplication.run(BiografBackendspringApplication.class);
        StaffService staffService = context.getBean(StaffService.class);


        Staff test = new Staff(name, phone, username, password);
        staffService.addStaff(test);

    }

}



//BiografBackendspringApplication
// Staff test = new Staff("Eddie",  "0701175555", "boy@gmail.com", "öö");
// staffService.addStaff(test);


//HJÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄÄLP VARFÖR FUNKAR DET INTEEEEEEEEEEEEEEEEEEEEE

//LOL