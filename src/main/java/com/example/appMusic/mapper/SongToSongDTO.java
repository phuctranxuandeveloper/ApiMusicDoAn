package com.example.appMusic.mapper;

import com.example.appMusic.DTO.SongDTO;
import com.example.appMusic.entities.Song;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SongToSongDTO implements Function<Song, SongDTO> {
    @Override
    public SongDTO apply(Song song) {
        return new SongDTO(
                song.getSongId(),
                song.getTitle(),
                song.getReleaseDate(),
                song.getDuration(),
                song.getAvatar(),
                song.getGenre().getName(),
                song.getArtist(),
                song.getPlaylists().stream().map(playlist -> playlist.getPlaylistId()).collect(Collectors.toList()),
                song.getAlbums().stream().map(album -> album.getTitle()).collect(Collectors.toList()),
                song.getUrlMusic()
        );
    }
}
