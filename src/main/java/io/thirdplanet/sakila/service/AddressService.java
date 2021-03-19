package io.thirdplanet.sakila.service;


import io.thirdplanet.sakila.dao.Address;
import io.thirdplanet.sakila.repo.AddressRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    private AddressRepo addressRepo ;

    public AddressService(AddressRepo addressRepo){
        this.addressRepo = addressRepo;
    }

    public Optional<List<Address>> findAll(){
        List<Address> list = addressRepo.findAll();
        Optional<List<Address>> opt = Optional.of(list);
        return opt;
    }


    public Optional<Page<Address>> findAll(int page, int size ){
        Pageable pageable = PageRequest.of(page, size);
        Page<Address> list = addressRepo.findAll(pageable);
        Optional<Page<Address>> opt = Optional.of(list);
        return opt;
    }

    public Optional<Address> findById(Long id){
        Optional<Address> opt = addressRepo.findById(id);;
        return opt;
    }


}
