package com.example.appMusic.repositories;

import com.example.appMusic.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Optional<Album> findAlbumByAlbumId(Integer id);

    List<Album> findAll();

}
