package com.example.appMusic.DTO;

import java.util.List;

public class PlaylistDTO{
        private Integer id;
        private String name;
        private String userName;
        private List<String> listSong;

    public PlaylistDTO(Integer id, String name, String userName, List<String> listSong) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.listSong = listSong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getListSong() {
        return listSong;
    }

    public void setListSong(List<String> listSong) {
        this.listSong = listSong;
    }
}
