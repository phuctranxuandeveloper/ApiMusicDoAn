package com.example.appMusic.controllers;

import com.example.appMusic.DTO.PlaylistDTO;
import com.example.appMusic.entities.Playlist;
import com.example.appMusic.entities.User;
import com.example.appMusic.services.PlaylistService;
import com.example.appMusic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "playlist")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<?> getAllPlayList(){
        List<PlaylistDTO> list = playlistService.getAllPlaylist();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping(path = "id/{id}")
    public ResponseEntity<?> findPlaylistById(@PathVariable Integer id){
        PlaylistDTO pl = playlistService.findPlaylistById(id);
        return new ResponseEntity<>(pl, HttpStatus.OK);
    }

    @GetMapping(path = "name/{name}")
    public ResponseEntity<?> findPlaylistByName(@PathVariable String name){
        List<PlaylistDTO> list = playlistService.findPlaylistByName(name);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping(path = "create")
    public ResponseEntity<?> createPlaylist(@RequestParam String name, @RequestParam Integer user_id){
        User user = userService.findUserById(user_id).orElse(null);
        if (user != null && name != null){
            Playlist playlist = playlistService.savePlaylist(name, user);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body("Playlist created!");
    }
    @PostMapping(path = "add_song")
    public ResponseEntity<?> addSongToPlaylist(@RequestParam Integer playlist_id, @RequestParam Integer song_id){
        playlistService.addSongToPlaylist(playlist_id, song_id);
        return ResponseEntity.status(HttpStatus.CREATED).body("Add song successful!");
    }
    @GetMapping(path = "user/{user_id}")
    public ResponseEntity<?> findPlaylistByUserId(@PathVariable Integer user_id){
        List<PlaylistDTO> list = playlistService.findPlaylistByUserId(user_id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
