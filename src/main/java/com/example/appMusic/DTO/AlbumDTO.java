package com.example.appMusic.DTO;

import java.sql.Time;
import java.sql.Date;
import java.util.List;

public class AlbumDTO{
        private Integer id;
        private String title;
        private Date releaseDate;
        private Time duration;
        private String nameArtist;
        private String avatar;
        private List<String> listSong;

    public AlbumDTO(Integer id, String title, Date releaseDate, Time duration, String nameArtist, String avatar, List<String> listSong) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.nameArtist = nameArtist;
        this.avatar = avatar;
        this.listSong = listSong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<String> getListSong() {
        return listSong;
    }

    public void setListSong(List<String> listSong) {
        this.listSong = listSong;
    }
}
