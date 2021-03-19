package io.thirdplanet.sakila.repo;

import io.thirdplanet.sakila.dao.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepo extends JpaRepository<Category, Long>, PagingAndSortingRepository<Category, Long> {

}
