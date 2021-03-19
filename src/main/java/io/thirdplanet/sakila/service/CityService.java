package io.thirdplanet.sakila.service;


import io.thirdplanet.sakila.dao.Category;
import io.thirdplanet.sakila.dao.City;
import io.thirdplanet.sakila.repo.CityRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    private CityRepo cityRepo ;

    public CityService(CityRepo cityRepo){
        this.cityRepo = cityRepo ;
    }

    public Optional<List<City>> findAll(){
        List<City> foo = cityRepo.findAll();
        Optional< List<City>> opt = Optional.of(foo);
        return opt ;
    }

    public Optional<Page<City>> findAll(int page, int size){
        Pageable pageable = PageRequest.of(0, 10);
        Page<City> foo = cityRepo.findAll(pageable);
        Optional<Page<City>> opt = Optional.of(foo);
        return opt ;
    }

    public Optional<City> findById(Long id){
        Optional<City> category = cityRepo.findById(id);
        return category ;
    }



}
