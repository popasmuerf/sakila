package io.thirdplanet.sakila.service;

import io.thirdplanet.sakila.dao.Actor;
import io.thirdplanet.sakila.dao.FilmActor ;
import io.thirdplanet.sakila.dao.FilmActorId;
import io.thirdplanet.sakila.repo.ActorRepo;
import io.thirdplanet.sakila.repo.FilmActorRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {
    private ActorRepo actorRepo ;
    private FilmActorRepo filmActorRepo ;

    public ActorService(ActorRepo   actorRepo ,
                        FilmActorRepo filmActorRepo){
        this.actorRepo  = actorRepo;
        this.filmActorRepo = filmActorRepo;
    }

    public Optional<List<Actor>>  getActors(){
        Pageable pageable = PageRequest.of(0, 10);
        List<Actor> actors = actorRepo.findAll() ;
        Optional<List<Actor>> opt  = Optional.of(actors);
        return opt ;
    }

    public Page<Actor>  getActors(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Actor> actors = actorRepo.findAll(pageable);
        return actors ;
    }

    public Optional<Actor>  getActorById(String id){
        Long _id = Long.parseLong(id);
        Optional<Actor> actor = actorRepo.findById(_id);
        return actor ;
    }

    public Optional<List<FilmActor>>  getFilmActors(){
        Pageable pageable = PageRequest.of(0, 10);
        List<FilmActor> filmActors = filmActorRepo.findAll() ;
        Optional<List<FilmActor>> opt  = Optional.of(filmActors );
        return opt ;
    }

    public Optional<Page<FilmActor>>  getFilmActorsByPage(int page, int size){
        Pageable pageable = PageRequest.of(0, 10);
        Page<FilmActor> filmActors = filmActorRepo.findAll(pageable) ;
        Optional<Page<FilmActor>> opt = Optional.of(filmActors);
        return opt;
    }

    public Optional<FilmActor>  getFilmActorById(FilmActorId filmActorId){
        Optional<FilmActor> filmActor = filmActorRepo.findById(filmActorId);
        return filmActor ;
    }
}
