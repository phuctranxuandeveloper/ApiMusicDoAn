package com.example.appMusic.repositories;

import com.example.appMusic.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    @Override
    List<Genre> findAll();

    Optional<Genre> findGenreByGenreId(Integer id);
}
