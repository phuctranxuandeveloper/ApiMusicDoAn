package com.example.appMusic.controllers;

import com.example.appMusic.DTO.SongDTO;
import com.example.appMusic.entities.Song;
import com.example.appMusic.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "song")
public class SongController {
    @Autowired
    private SongService songService;
    @GetMapping
    public ResponseEntity<?> findAllSong(){
        List<SongDTO> list = songService.findAllSong();
        Map<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", list.size());
        apiResponse.put("list_song", list);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    @GetMapping(path = "/top")
    public ResponseEntity<?> findTopSong(){
        List<SongDTO> list = songService.findAllSong().stream().limit(5).collect(Collectors.toList());
        Map<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", list.size());
        apiResponse.put("list_song", list);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    @GetMapping(path = "id/{id}")
    public ResponseEntity<?> findSongById(@PathVariable Integer id){
        SongDTO songDTO = songService.findSongById(id);
        return new ResponseEntity<>(songDTO, HttpStatus.OK);
    }
    @GetMapping(path = "title/title")
    public ResponseEntity<?> findSongByTitle(String title){
        List<SongDTO> songDTO = songService.findSongByTitle(title);
        return new ResponseEntity<>(songDTO, HttpStatus.OK);
    }
    @GetMapping(path = "artist_id/{id}")
    public ResponseEntity<?> findSongByArtistId(@PathVariable Integer id){
        List<SongDTO> list = songService.findSongByArtistId(id);
        HashMap<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", list.size());
        apiResponse.put("list_song", list);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    @GetMapping(path = "playlist_id/{playlistId}")
    public ResponseEntity<?> findSongByPlaylistId(@PathVariable Integer playlistId){
        List<SongDTO> list = songService.findSongByPlaylistId(playlistId);
        HashMap<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", list.size());
        apiResponse.put("list_song", list);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
