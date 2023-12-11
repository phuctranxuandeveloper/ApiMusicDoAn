package com.example.appMusic.services;

import com.example.appMusic.DTO.GenreDTO;

import java.util.List;

public interface GenreService {
    List<GenreDTO> findAllGenre();

    GenreDTO findGenreById(Integer id);


}
