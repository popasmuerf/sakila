package io.thirdplanet.sakila.service;


import io.thirdplanet.sakila.dao.Film;
import io.thirdplanet.sakila.dao.FilmActor;
import io.thirdplanet.sakila.repo.FilmActorRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmActorService {
    private FilmActorRepo filmActorRepo;


    public FilmActorService(FilmActorRepo filmActorRepo){
        this.filmActorRepo = filmActorRepo;
    }

    /*
        public Optional<List<FilmActor>>  getFilmActors(){
        Pageable pageable = PageRequest.of(0, 10);
        List<FilmActor> filmActors = filmActorRepo.findAll() ;
        Optional<List<FilmActor>> opt  = Optional.of(filmActors );
        return opt ;
    }
     */

    public Optional<List<FilmActor>> getFilmActors(){
        List<FilmActor> foo = filmActorRepo.findAll();
        Optional<List<FilmActor>> opt = Optional.of(foo);
        return opt ;
    }

    public Optional<Page<FilmActor>> getFilmActors(int page, int size){
        Pageable pageable = PageRequest.of(0, 10);
        Page<FilmActor> foo = filmActorRepo.findAll(pageable);
        Optional<Page<FilmActor>> opt = Optional.of(foo);
        return opt ;
    }



}
