package com.example.appMusic.services;

import com.example.appMusic.DTO.PlaylistDTO;
import com.example.appMusic.entities.Playlist;

import java.util.ArrayList;
import java.util.List;

public interface PlaylistService {
    List<PlaylistDTO> getAllPlaylist();
    PlaylistDTO findPlaylistById(Integer id);
    List<PlaylistDTO> findPlaylistByName(String name);
}
