package com.example.appMusic.controllers;

import com.example.appMusic.DTO.GenreDTO;
import com.example.appMusic.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<GenreDTO> findAllGenre(){
        return genreService.findAllGenre();
    }
    @GetMapping(path = "id/{id}")
    public GenreDTO findGenreById(@PathVariable Integer id){
        return genreService.findGenreById(id);
    }
}
