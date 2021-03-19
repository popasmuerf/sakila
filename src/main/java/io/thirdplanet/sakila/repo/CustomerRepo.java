package io.thirdplanet.sakila.repo;

import io.thirdplanet.sakila.dao.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long>, PagingAndSortingRepository<Customer, Long> {
}
