package io.thirdplanet.sakila.dao;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
public class FilmActorId implements Serializable {
    @Getter
    @Setter
    @Column(name = "actor_id")
    Long actorId ;

    @Getter
    @Setter
    @Column(name = "film_id")
    Long filmId ;



/*
    @Override
    public boolean equals(Object o){
        if(this == o)
            return true ;
        if(o == null || getClass() != o.getClass())
            return  false ;

        FilmActorId that = (FilmActorId) o;

        if(actorId.equals(that.actorId))
            return false ;

        return filmId.equals(that.actorId);
    }
*/

    /*
    @Override
    public int hashCode(){
        int result = actorId.hashCode();
        result = 31 * result + filmId.hashCode();
        return result;
    }
*/
}
