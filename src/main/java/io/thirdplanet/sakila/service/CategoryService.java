package io.thirdplanet.sakila.service;


import io.thirdplanet.sakila.dao.Category;
import io.thirdplanet.sakila.repo.CategoryRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    CategoryRepo categoryRepo ;

    public CategoryService(CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo ;
    }

    public Optional<List<Category>> findAll(){
        List<Category> foo = categoryRepo.findAll();
        Optional< List<Category>> opt = Optional.of(foo);
        return opt ;
    }

    public Optional<Page<Category>> findAll(int page, int size){
        Pageable pageable = PageRequest.of(0, 10);
        Page<Category> foo = categoryRepo.findAll(pageable);
        Optional<Page<Category>> opt = Optional.of(foo);
        return opt ;
    }

    public Optional<Category> findById(Long id){
        Optional<Category> category = categoryRepo.findById(id);
        return category ;
    }



}
