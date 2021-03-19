package io.thirdplanet.sakila.controller;

import io.thirdplanet.sakila.dao.Category;
import io.thirdplanet.sakila.dao.City;
import io.thirdplanet.sakila.service.CategoryService;
import io.thirdplanet.sakila.service.CityService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sakila")
public class CityController {
    private CityService cityService ;

    public CityController(CityService cityService){

        this.cityService = cityService;
    }


    @GetMapping("/city/foo")
    @ResponseBody
    public String cityFoo(){return "CityFoo";}

    @GetMapping("/cities")
    @ResponseBody
    public Optional<List<City>> findAll(){
        return cityService.findAll();
    }

    @GetMapping("/cities/pages")
    @ResponseBody
    Optional<Page<City>> findAll(@RequestParam(name="page",defaultValue = "0") String page,
                                     @RequestParam(name="size",defaultValue = "10") String size){
        return cityService.findAll(Integer.parseInt(page),Integer.parseInt(size));
    }

    @GetMapping("/city/{id}")
    @ResponseBody
    Optional<City> findById(@PathVariable(name="id",required = true) String id){
        Long _id =  Long.parseLong(id);
        return cityService.findById(_id);
    }

}
