package io.thirdplanet.sakila.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="category")
public class Category {

    @Getter
    @Setter
    @Column(name="category_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Getter
    @Setter
    @Column(name="name")
    private String name ;


    @Getter
    @Setter
    @Column(name="last_update")
    private Timestamp lastUpdate ;


}
