package com.example.appMusic.services;

import com.example.appMusic.DTO.PlaylistDTO;
import com.example.appMusic.entities.Playlist;
import com.example.appMusic.mapper.PlaylistToPlaylistDTO;
import com.example.appMusic.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlaylistServiceImpl implements PlaylistService{
    @Autowired
    private PlaylistRepository playlistRepository;

    @Autowired
    private PlaylistToPlaylistDTO playlistToPlaylistDTO;

    @Override
    public List<PlaylistDTO> getAllPlaylist() {
        return playlistRepository.findAll()
                .stream().map(playlistToPlaylistDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PlaylistDTO findPlaylistById(Integer id) {
        return playlistRepository.findPlaylistByPlaylistId(id)
                .map(playlistToPlaylistDTO)
                .orElse(null);
    }

    @Override
    public List<PlaylistDTO> findPlaylistByName(String name) {
        return playlistRepository.findPlaylistByName(name)
                .stream().map(playlistToPlaylistDTO)
                .collect(Collectors.toList());
    }
}
