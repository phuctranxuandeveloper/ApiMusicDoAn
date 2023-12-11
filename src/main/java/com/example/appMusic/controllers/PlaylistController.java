package com.example.appMusic.controllers;

import com.example.appMusic.DTO.PlaylistDTO;
import com.example.appMusic.entities.Playlist;
import com.example.appMusic.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "playlist")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;

    @GetMapping
    public List<PlaylistDTO> getAllPlayList(){
        return playlistService.getAllPlaylist();
    }

    @GetMapping(path = "id/{id}")
    public PlaylistDTO findPlaylistById(@PathVariable Integer id){
        return playlistService.findPlaylistById(id);
    }

    @GetMapping(path = "name/{name}")
    public List<PlaylistDTO> findPlaylistByName(@PathVariable String name){
        return playlistService.findPlaylistByName(name);
    }
}
