package com.example.appMusic.services;

import com.example.appMusic.DTO.SongDTO;

import java.util.List;

public interface SongService {
    List<SongDTO> findAllSong();
    SongDTO findSongById(Integer id);
    List<SongDTO> searchSongByName(String key);
    List<SongDTO> findSongByTitle(String title);
    List<SongDTO> findSongByArtistId(Integer id);
    List<SongDTO> findSongByPlaylistId(Integer playlistId);
}
