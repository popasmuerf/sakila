package io.thirdplanet.sakila.dao;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.geo.Polygon;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="address")
public class Address {
   @Getter
   @Setter
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="address_id")
   private Long addressId ;

   @Getter
   @Setter
   @Column(name="address")
   private String address ;

   @Getter
   @Setter
   @Column(name="address2")
   private String address2 ;

   @Getter
   @Setter
   @Column(name="district")
   private String district ;

   @Getter
   @Setter
   @Column(name="city_id")
   private short cityId ;

   @Getter
   @Setter
   @Column(name="postal_code")
   private String postalCode ;

   @Getter
   @Setter
   @Column(name="phone")
   private String phone ;


   @Getter
   @Setter
   @Column(name="location")
   private byte[] location ;


    @Getter
    @Setter
    @Column(name="last_update")
    private Timestamp lastUpdate ;


}
