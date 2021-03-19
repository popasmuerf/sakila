package io.thirdplanet.sakila.controller;


import io.thirdplanet.sakila.dao.Address;
import io.thirdplanet.sakila.service.AddressService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sakila")
public class AddressController {

    private AddressService addressService ;

    public AddressController(AddressService addressService){
        this.addressService = addressService ;
    }


    @GetMapping("/address/foo")
    @ResponseBody
    public String actorFoo(){return "AddressFoo";}

    @GetMapping("/address")
    @ResponseBody
    public Optional<List<Address>> findAll(){
        return addressService.findAll();
    }

    @GetMapping("/address/pages")
    @ResponseBody
    Optional<Page<Address>> findAll(@RequestParam(name="page",defaultValue = "0") String page,
                          @RequestParam(name="size",defaultValue = "10") String size){
        return addressService.findAll(Integer.parseInt(page),Integer.parseInt(size));
    }

    @GetMapping("/address/{id}")
    @ResponseBody
    Optional<Address> findById(@PathVariable(name="id",required = true) String id){
       Long _id =  Long.parseLong(id);
       return addressService.findById(_id);
    }

/*
    @GetMapping("/actor/{id}")
    @ResponseBody
    public Optional<Actor>  getActorById(@PathVariable(name="id", required = true) String id){
        return actorService.getActorById(id);
    }
*/
}
