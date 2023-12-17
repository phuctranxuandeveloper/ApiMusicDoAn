package com.example.appMusic.controllers;

import com.example.appMusic.DTO.ArtistDTO;
import com.example.appMusic.entities.Artist;
import com.example.appMusic.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "artist")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @GetMapping
    public ResponseEntity<?> getAllArtist(){
        List<ArtistDTO> listArtist = artistService.getAllArtist();
        Map<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", listArtist.size());
        apiResponse.put("listArtist", listArtist);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @GetMapping(path = "name/{name}")
    public ResponseEntity<?> findAllArtistByName(@PathVariable String name){
        List<ArtistDTO> listArtist = artistService.findArtistByName(name);
        Map<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", listArtist.size());
        apiResponse.put("listArtist", listArtist);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @GetMapping(path = "id/{id}")
    public ResponseEntity<?> findAllArtistById(@PathVariable Integer id){
        List<ArtistDTO> listArtist = artistService.findArtistById(id);
        Map<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", listArtist.size());
        apiResponse.put("listArtist", listArtist);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
