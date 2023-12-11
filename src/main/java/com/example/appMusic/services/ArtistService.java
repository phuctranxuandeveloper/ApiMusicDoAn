package com.example.appMusic.services;

import com.example.appMusic.DTO.ArtistDTO;
import com.example.appMusic.entities.Artist;

import java.util.ArrayList;
import java.util.List;

public interface ArtistService {
    List<ArtistDTO> getAllArtist();
    List<ArtistDTO> findArtistByName(String name);
    List<ArtistDTO> findArtistById(Integer id);
    List<ArtistDTO> searchArtistByName(String key);
}
