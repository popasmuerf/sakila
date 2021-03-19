package io.thirdplanet.sakila.repo;


import io.thirdplanet.sakila.dao.Category;
import io.thirdplanet.sakila.dao.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepo extends JpaRepository<City, Long>, PagingAndSortingRepository<City, Long> {

}
