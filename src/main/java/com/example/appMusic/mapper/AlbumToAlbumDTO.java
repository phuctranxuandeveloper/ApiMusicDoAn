package com.example.appMusic.mapper;

import com.example.appMusic.DTO.AlbumDTO;
import com.example.appMusic.entities.Album;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;
@Service
public class AlbumToAlbumDTO implements Function<Album, AlbumDTO> {
    @Override
    public AlbumDTO apply(Album album) {
        return new AlbumDTO(
                album.getAlbumId(),
                album.getTitle(),
                album.getReleaseDate(),
                album.getDuration(),
                album.getArtist().getName(),
                album.getAvatar(),
                album.getSongsAb().stream().map(song -> song.getTitle()).collect(Collectors.toList())
        );
    }
}
