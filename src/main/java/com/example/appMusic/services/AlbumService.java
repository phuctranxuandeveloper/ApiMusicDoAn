package com.example.appMusic.services;

import com.example.appMusic.DTO.AlbumDTO;

import java.util.List;

public interface AlbumService {
    List<AlbumDTO> findAllAlbum();
    AlbumDTO findAlbumById(Integer id);
}
