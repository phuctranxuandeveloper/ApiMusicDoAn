package com.example.appMusic.mapper;

import com.example.appMusic.DTO.GenreDTO;
import com.example.appMusic.entities.Genre;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class GenreToGenreDTO implements Function<Genre, GenreDTO> {
    @Override
    public GenreDTO apply(Genre genre) {
        return new GenreDTO(genre.getName());
    }
}
