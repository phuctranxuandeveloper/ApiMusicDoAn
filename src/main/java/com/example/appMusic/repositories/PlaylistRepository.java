package com.example.appMusic.repositories;

import com.example.appMusic.entities.Playlist;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
    List<Playlist> findAll();
    Optional<Playlist> findPlaylistByPlaylistId(Integer id);
    List<Playlist> findPlaylistByName(String name);
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO playlistsong (playlistId, songId) VALUES (:playlistId, :songId)", nativeQuery = true)
    void addSongToPlaylist(@Param("playlistId") Integer playlistId, @Param("songId") Integer songId);

}
