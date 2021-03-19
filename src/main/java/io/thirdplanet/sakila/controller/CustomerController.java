package io.thirdplanet.sakila.controller;

import io.thirdplanet.sakila.dao.City;
import io.thirdplanet.sakila.dao.Customer;
import io.thirdplanet.sakila.service.CityService;
import io.thirdplanet.sakila.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sakila")
public class CustomerController {

    private CustomerService customerService ;

    public CustomerController(CustomerService customerService){

        this.customerService = customerService;
    }


    @GetMapping("/customer/foo")
    @ResponseBody
    public String cityFoo(){return "CustomerFoo";}

    @GetMapping("/customers")
    @ResponseBody
    public Optional<List<Customer>> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/customers/pages")
    @ResponseBody
    Optional<Page<Customer>> findAll(@RequestParam(name="page",defaultValue = "0") String page,
                                 @RequestParam(name="size",defaultValue = "10") String size){
        return customerService.findAll(Integer.parseInt(page),Integer.parseInt(size));
    }

    @GetMapping("/customer/{id}")
    @ResponseBody
    Optional<Customer> findById(@PathVariable(name="id",required = true) String id){
        Long _id =  Long.parseLong(id);
        return customerService.findById(_id);
    }

}
