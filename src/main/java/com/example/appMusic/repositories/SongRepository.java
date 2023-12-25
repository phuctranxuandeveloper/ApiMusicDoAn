package com.example.appMusic.repositories;

import com.example.appMusic.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Integer> {
    List<Song> findAll();
    Optional<Song> findSongBySongId(Integer id);
    List<Song> findSongByTitle(String title);
    List<Song> findByTitleContainingIgnoreCase(String key);
    List<Song> findByArtistArtistId(Integer id);
    @Query(value = "select songs.* from playlistsong inner join songs on playlistsong.songId = songs.songId where playlistId = :playlistId", nativeQuery = true)
    List<Song> findListSongByPlaylistId(@Param("playlistId") Integer id);
}
