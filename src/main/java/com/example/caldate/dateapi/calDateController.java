package com.example.caldate.dateapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/")
public class calDateController {

    @Autowired
    CalDateService calDateService;

    @GetMapping("/hello")
    private String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello/{name}")
    private  String HelloName(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/add")
    private  String SumOfTwoNumber(@RequestParam("x")int x,
                                @RequestParam("y")int y){

        int sum = calDateService.SumTwoNumber(x,y);
        return "X + Y = "+ sum;
    }

    @PostMapping("/customer")
    private CustomerModelDto CreateCustomer(@RequestBody CustomerModelDto customerModelDto) {

        CustomerModelDto customer = new CustomerModelDto();
        customer.setFirsname("นาย " + customerModelDto.getFirsname());
        customer.setLastname(customerModelDto.getLastname());

        int age;

        age = calDateService.calAgeCustomer(customerModelDto.getBirthyear());
        customer.setAge(age);
        customer.setBirthyear(customerModelDto.getBirthyear());
        return customer;
    }

}
