package com.example.appMusic.controllers;

import com.example.appMusic.DTO.GenreDTO;
import com.example.appMusic.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "genre")
public class GenreController {
    @Autowired
    private GenreService genreService;
    @GetMapping
    public ResponseEntity<?> findAllGenre(){
        List<GenreDTO> list = genreService.findAllGenre();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping(path = "id/{id}")
    public ResponseEntity<?> findGenreById(@PathVariable Integer id){
        GenreDTO genre = genreService.findGenreById(id);
        return new ResponseEntity<>(genre, HttpStatus.OK);
    }
}
