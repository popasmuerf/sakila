package io.thirdplanet.sakila.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name="film_actor")
public class FilmActor {
    @EmbeddedId
    @Getter
    @Setter
    FilmActorId filmActorId;


    @Getter
    @Setter
    @Column(name="last_update")
    private Timestamp lastUpdate ;

}
/*
I love this type of porn...shit is ridiculous...
look at this bitch at the pool like a goddess...
and then here come this big black farm hand
looking like nigga.....and you know he can't
wait to ravish that white whore....LOL
 */