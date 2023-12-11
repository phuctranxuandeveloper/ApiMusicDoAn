package com.example.appMusic.services;

import com.example.appMusic.DTO.AlbumDTO;
import com.example.appMusic.mapper.AlbumToAlbumDTO;
import com.example.appMusic.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlbumServiceImpl implements AlbumService{
    @Autowired
    private AlbumRepository albumRepository;
    @Autowired
    private AlbumToAlbumDTO albumToAlbumDTO;
    @Override
    public List<AlbumDTO> findAllAlbum() {
        return albumRepository.findAll()
                .stream().map(albumToAlbumDTO)
                .collect(Collectors.toList());
    }

    @Override
    public AlbumDTO findAlbumById(Integer id) {
        return albumRepository.findAlbumByAlbumId(id)
                .map(albumToAlbumDTO)
                .orElse(null);
    }
}
