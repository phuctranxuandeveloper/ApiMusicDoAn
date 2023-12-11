package com.example.appMusic.controllers;

import com.example.appMusic.DTO.AlbumDTO;
import com.example.appMusic.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "album")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @GetMapping
    public List<AlbumDTO> findAllAlbum(){
        return albumService.findAllAlbum();
    }

    @GetMapping(path = "id/{id}")
    public AlbumDTO findAlbumById(@PathVariable Integer id){
        return albumService.findAlbumById(id);
    }
}
