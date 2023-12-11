package com.example.appMusic.repositories;

import com.example.appMusic.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Integer> {
    List<Song> findAll();
    Optional<Song> findSongBySongId(Integer id);
    List<Song> findSongByTitle(String title);
    List<Song> findByTitleContainingIgnoreCase(String key);

}
