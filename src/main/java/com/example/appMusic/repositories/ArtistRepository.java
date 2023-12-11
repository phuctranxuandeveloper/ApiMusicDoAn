package com.example.appMusic.repositories;

import com.example.appMusic.entities.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    List<Artist> findAll();
    List<Artist> findByName(String name);
    List<Artist> findByArtistId(Integer id);
    List<Artist> findByNameContainingIgnoreCase(String key);
}
