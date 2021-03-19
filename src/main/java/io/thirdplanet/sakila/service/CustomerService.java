package io.thirdplanet.sakila.service;



import io.thirdplanet.sakila.dao.Customer;

import io.thirdplanet.sakila.repo.CustomerRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepo customerRepo ;

    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo ;
    }

    public Optional<List<Customer>> findAll(){
        List<Customer> foo = customerRepo.findAll();
        Optional< List<Customer>> opt = Optional.of(foo);
        return opt ;
    }

    public Optional<Page<Customer>> findAll(int page, int size){
        Pageable pageable = PageRequest.of(0, 10);
        Page<Customer> foo = customerRepo.findAll(pageable);
        Optional<Page<Customer>> opt = Optional.of(foo);
        return opt ;
    }

    public Optional<Customer> findById(Long id){
        Optional<Customer> category = customerRepo.findById(id);
        return category ;
    }

}
