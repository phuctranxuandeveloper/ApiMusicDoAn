package com.example.appMusic.services;

import com.example.appMusic.DTO.PlaylistDTO;
import com.example.appMusic.entities.Playlist;
import com.example.appMusic.entities.User;

import java.util.ArrayList;
import java.util.List;

public interface PlaylistService {
    List<PlaylistDTO> getAllPlaylist();
    PlaylistDTO findPlaylistById(Integer id);
    List<PlaylistDTO> findPlaylistByName(String name);
    Playlist savePlaylist(String name, User user);
    void addSongToPlaylist(Integer playlist_id, Integer song_id);
    List<PlaylistDTO> findPlaylistByUserId(Integer user_id);
}
