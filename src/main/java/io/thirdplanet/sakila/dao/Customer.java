package io.thirdplanet.sakila.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="customer")
public class Customer {

    @Getter
    @Setter
    @Column(name="customer_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    @Getter
    @Setter
    @Column(name="store_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  storeId;

    @Getter
    @Setter
    @Column(name="first_name")
    private String firstName ;


    @Getter
    @Setter
    @Column(name="email")
    private String  email;

    @Getter
    @Setter
    @Column(name="address_id")
    private Long  addressId;


    @Getter
    @Setter
    @Column(name="active")
    private short  active;

    @Getter
    @Setter
    @Column(name="create_date")
    private Timestamp createDate ;


    @Getter
    @Setter
    @Column(name="last_update")
    private Timestamp lastUpdate ;

}
