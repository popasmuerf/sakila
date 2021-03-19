package io.thirdplanet.sakila.repo;


import io.thirdplanet.sakila.dao.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AddressRepo extends JpaRepository<Address, Long>, PagingAndSortingRepository<Address, Long> {
}
