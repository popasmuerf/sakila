package io.thirdplanet.sakila.dao;

import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="film")
public class Film {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="film_id")
    private Long filmId;


    @Getter
    @Setter
    @Column(name="title")
    private String title;


    @Getter
    @Setter
    @Column(name="description")
    private String description;

    @Getter
    @Setter
    @Column(name="releaseYear")
    private Date releaseYear;


    @Getter
    @Setter
    @Column(name="language_id")
    private Long languageId;


    @Getter
    @Setter
    @Column(name="rentalDuration")
    private short rentalDuration;


    @Getter
    @Setter
    @Column(name="rentalRate")
    private float rentalRate;

    @Getter
    @Setter
    @Column(name="length")
    private short length;


    @Getter
    @Setter
    @Column(name="replacement_cost")
    private float replacementCost;

    @Getter
    @Setter
    @Column(name="rating")
    private String rating;

    @Getter
    @Setter
    @Column(name="special_features")
    private String specialFeatures;


    @Getter
    @Setter
    @Column(name="last_update")
    private Timestamp lastUpdate;

}

