package com.example.appMusic.mapper;

import com.example.appMusic.DTO.ArtistDTO;
import com.example.appMusic.entities.Artist;
import org.springframework.stereotype.Service;

import java.util.function.Function;
@Service
public class ArtistToArtistDTO implements Function<Artist, ArtistDTO> {
    @Override
    public ArtistDTO apply(Artist artist) {
        return new ArtistDTO(
                artist.getArtistId(),
                artist.getName(),
                artist.getAvatar()
        );
    }
}
