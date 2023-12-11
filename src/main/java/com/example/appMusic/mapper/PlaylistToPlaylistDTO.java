package com.example.appMusic.mapper;

import com.example.appMusic.DTO.PlaylistDTO;
import com.example.appMusic.entities.Playlist;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;
@Service
public class PlaylistToPlaylistDTO implements Function<Playlist, PlaylistDTO> {
    @Override
    public PlaylistDTO apply(Playlist playlist) {
        return new PlaylistDTO(
                playlist.getPlaylistId(),
                playlist.getName(),
                playlist.getUser().getFirstName() + " " + playlist.getUser().getLastName(),
                playlist.getSongsPl().stream().map(song -> song.getTitle()).collect(Collectors.toList())
        );
    }
}
