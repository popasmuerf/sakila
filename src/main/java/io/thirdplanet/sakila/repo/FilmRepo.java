package io.thirdplanet.sakila.repo;

import io.thirdplanet.sakila.dao.Film;
import io.thirdplanet.sakila.dao.FilmActor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmRepo extends JpaRepository<Film,Long>, PagingAndSortingRepository<Film, Long> {
}
