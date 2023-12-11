package com.example.appMusic.services;

import com.example.appMusic.DTO.ArtistDTO;
import com.example.appMusic.entities.Artist;
import com.example.appMusic.mapper.ArtistToArtistDTO;
import com.example.appMusic.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistServiceImpl implements ArtistService {
    @Autowired
    private ArtistRepository artistRepository;
    @Autowired
    private ArtistToArtistDTO artistToArtistDTO;
    @Override
    public List<ArtistDTO> getAllArtist() {
        return artistRepository.findAll()
                .stream().map(artistToArtistDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ArtistDTO> findArtistByName(String name) {
        return artistRepository.findByName(name)
                .stream().map(artistToArtistDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ArtistDTO> findArtistById(Integer id) {
        return artistRepository.findByArtistId(id)
                .stream().map(artistToArtistDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<ArtistDTO> searchArtistByName(String key) {
        return artistRepository.findByNameContainingIgnoreCase(key)
                .stream().map(artistToArtistDTO)
                .collect(Collectors.toList());
    }
}
