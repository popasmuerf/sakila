package io.thirdplanet.sakila.repo;

import io.thirdplanet.sakila.dao.FilmActor;
import io.thirdplanet.sakila.dao.FilmActorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmActorRepo extends JpaRepository<FilmActor, FilmActorId>, PagingAndSortingRepository<FilmActor, FilmActorId> {
}
