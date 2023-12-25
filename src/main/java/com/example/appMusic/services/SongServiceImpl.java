package com.example.appMusic.services;

import com.example.appMusic.DTO.SongDTO;
import com.example.appMusic.mapper.SongToSongDTO;
import com.example.appMusic.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongServiceImpl implements SongService{
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private SongToSongDTO songToSongDTO;
    @Override
    public List<SongDTO> findAllSong() {
        return songRepository.findAll()
                .stream().map(songToSongDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SongDTO findSongById(Integer id) {
        return songRepository.findSongBySongId(id)
                .map(songToSongDTO)
                .orElse(null);
    }

    @Override
    public List<SongDTO> searchSongByName(String key) {
        return songRepository.findByTitleContainingIgnoreCase(key)
                .stream()
                .map(songToSongDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<SongDTO> findSongByTitle(String title) {
        return songRepository.findSongByTitle(title)
                .stream().map(songToSongDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<SongDTO> findSongByArtistId(Integer id) {
        return songRepository.findByArtistArtistId(id)
                .stream().map(songToSongDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<SongDTO> findSongByPlaylistId(Integer playlistId) {
        return songRepository.findListSongByPlaylistId(playlistId)
                .stream().map(songToSongDTO)
                .collect(Collectors.toList());
    }
}
