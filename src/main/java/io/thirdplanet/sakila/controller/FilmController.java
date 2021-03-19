package io.thirdplanet.sakila.controller;
import io.thirdplanet.sakila.dao.Film;
import io.thirdplanet.sakila.service.FilmService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sakila")
public class FilmController {
    FilmService filmService ;
    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

    @GetMapping("/film/foo")
    @ResponseBody
    public String filmFoo(){return "FilmFoo";}

    @GetMapping("/films")
    @ResponseBody
    public Optional<List<Film>> getFilms(){
        return filmService.getFilms();
    }

    @GetMapping("/films/pages")
    @ResponseBody
    Page<Film> getActors(@RequestParam(name="page",defaultValue = "0") String page,
                          @RequestParam(name="size",defaultValue = "10") String size){
        return filmService.getFilms(Integer.parseInt(page),Integer.parseInt(size));
    }

    @GetMapping("/film/{id}")
    @ResponseBody
    public Optional<Film>  getActorById(@PathVariable(name="id", required = true) String id){
        return filmService.getFilmById(id);
    }
}
