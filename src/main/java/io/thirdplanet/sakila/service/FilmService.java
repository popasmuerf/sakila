package io.thirdplanet.sakila.service;


import io.thirdplanet.sakila.dao.Actor;
import io.thirdplanet.sakila.dao.Film;
import io.thirdplanet.sakila.repo.FilmRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    FilmRepo filmRepo  ;
    public FilmService(FilmRepo filmRepo){
        this.filmRepo  = filmRepo ;
    }

    public Optional<List<Film>> getFilms(){
        Pageable pageable = PageRequest.of(0, 10);
        List<Film> films = filmRepo.findAll() ;
        Optional<List<Film>> opt  = Optional.of(films);
        return opt ;
    }

    public Page<Film> getFilms(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Film> actors = filmRepo.findAll(pageable);
        return actors ;
    }

    public Optional<Film>  getFilmById(String id){
        Long _id = Long.parseLong(id);
        Optional<Film> opt = filmRepo.findById(_id);
        return opt ;
    }
}
