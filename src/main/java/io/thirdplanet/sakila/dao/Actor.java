package io.thirdplanet.sakila.dao;

import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="actor")
public class Actor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name="actor_id")
    private Long actorId;


    @Getter
    @Setter
    @Column(name="first_name")
    private String firstName;

    @Getter
    @Setter
    @Column(name="last_name")
    private String lastName;

    @Getter
    @Setter
    @Column(name="last_update")
    private Timestamp lastUpdate ;

    /*
    @Getter
    @Setter
    //@ManyToMany(mappedBy =  "actor")
    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id"))
    private Set<Film> films  ;

     */

}