package com.example.appMusic.controllers;

import com.example.appMusic.DTO.ArtistDTO;
import com.example.appMusic.DTO.SongDTO;
import com.example.appMusic.services.ArtistService;
import com.example.appMusic.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "search")
public class SearchController {
    @Autowired
    private ArtistService artistService;
    @Autowired
    private SongService songService;
    @GetMapping
    public Map<String, Object> searchByKeyword(@RequestParam String q){
        List<SongDTO> listSong = songService.searchSongByName(q);
        List<ArtistDTO> listArtist = artistService.searchArtistByName(q);
        int total = listSong.size() + listArtist.size();
        Map<String, Object> apiResponse = new HashMap<>();
        apiResponse.put("total", total);
        apiResponse.put("songs", listSong);
        apiResponse.put("artists", listArtist);
        return apiResponse;
    }
}
