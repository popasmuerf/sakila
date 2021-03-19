package io.thirdplanet.sakila.controller;


import io.thirdplanet.sakila.dao.Actor;
import io.thirdplanet.sakila.dao.FilmActor;
import io.thirdplanet.sakila.service.ActorService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sakila")
public class ActorController {

    private ActorService actorService ;

    public ActorController(ActorService actorService){
        this.actorService = actorService;
    }

    @GetMapping("/actor/foo")
    @ResponseBody
    public String actorFoo(){return "ActorFoo";}

    @GetMapping("/actors")
    @ResponseBody
    public Optional<List<Actor>> getActors(){
        return actorService.getActors();
    }

    @GetMapping("/actors/pages")
    @ResponseBody
    Page<Actor>  getActors(@RequestParam(name="page",defaultValue = "0") String page,
                           @RequestParam(name="size",defaultValue = "10") String size){
        return actorService.getActors(Integer.parseInt(page),Integer.parseInt(size));
    }

    @GetMapping("/actor/{id}")
    @ResponseBody
    public Optional<Actor>  getActorById(@PathVariable(name="id", required = true) String id){
        return actorService.getActorById(id);
    }


    @GetMapping("/actors/films")
    @ResponseBody
    public Optional<List<FilmActor>> getFilmActors(){
        return actorService.getFilmActors();
    }



    @GetMapping("/actors/films/pages")
    @ResponseBody
    public Optional<Page<FilmActor>> getFilmActorsByPage(@RequestParam(name="page",defaultValue = "0") String page,
                           @RequestParam(name="size",defaultValue = "10") String size){
        return actorService.getFilmActorsByPage(Integer.parseInt(page),Integer.parseInt(size));
    }

}
