package io.thirdplanet.sakila.dao;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="city")
public class City {

    @Getter
    @Setter
    @Column(name="city_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cityId;

    @Getter
    @Setter
    @Column(name="city")
    private String city ;


    @Getter
    @Setter
    @Column(name="country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  countryId;


    @Getter
    @Setter
    @Column(name="last_update")
    private Timestamp lastUpdate ;


}
