package io.thirdplanet.sakila.controller;


import io.thirdplanet.sakila.dao.Address;
import io.thirdplanet.sakila.dao.Category;
import io.thirdplanet.sakila.service.AddressService;
import io.thirdplanet.sakila.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sakila")
public class CategoryController {

    private CategoryService categoryService ;

    public CategoryController(CategoryService categoryService){

        this.categoryService = categoryService;
    }


    @GetMapping("/category/foo")
    @ResponseBody
    public String categoryFoo(){return "AddressFoo";}

    @GetMapping("/categories")
    @ResponseBody
    public Optional<List<Category>> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("/categories/pages")
    @ResponseBody
    Optional<Page<Category>> findAll(@RequestParam(name="page",defaultValue = "0") String page,
                                    @RequestParam(name="size",defaultValue = "10") String size){
        return categoryService.findAll(Integer.parseInt(page),Integer.parseInt(size));
    }

    @GetMapping("/category/{id}")
    @ResponseBody
    Optional<Category> findById(@PathVariable(name="id",required = true) String id){
        Long _id =  Long.parseLong(id);
        return categoryService.findById(_id);
    }

}
