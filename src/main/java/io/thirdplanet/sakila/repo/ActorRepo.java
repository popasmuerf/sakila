package io.thirdplanet.sakila.repo;

import io.thirdplanet.sakila.dao.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ActorRepo extends JpaRepository<Actor, Long>, PagingAndSortingRepository<Actor, Long> {
}
