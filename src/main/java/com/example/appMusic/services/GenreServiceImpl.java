package com.example.appMusic.services;

import com.example.appMusic.DTO.GenreDTO;
import com.example.appMusic.mapper.GenreToGenreDTO;
import com.example.appMusic.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreServiceImpl implements GenreService{
    @Autowired
    private GenreRepository genreRepository;
    @Autowired
    private GenreToGenreDTO genreToGenreDTO;
    @Override
    public List<GenreDTO> findAllGenre() {
        return genreRepository.findAll()
                .stream().map(genreToGenreDTO)
                .collect(Collectors.toList());
    }

    @Override
    public GenreDTO findGenreById(Integer id) {
        return genreRepository.findGenreByGenreId(id)
                .map(genreToGenreDTO)
                .orElse(null);
    }
}
