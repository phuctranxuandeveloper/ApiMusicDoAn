package com.example.appMusic.DTO;

import com.example.appMusic.entities.Artist;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class SongDTO{
    Integer id;
    String title;
    Date releaseDate;
    Time duration;
    String avatar;
    String genre;
    Artist artist;
    List<Integer> listPlaylist;
    List<String> listAlbum;
    String urlMusic;

    public SongDTO(Integer id, String title, Date releaseDate, Time duration, String avatar, String genre, Artist artist, List<Integer> listPlaylist, List<String> listAlbum, String urlMusic) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.avatar = avatar;
        this.genre = genre;
        this.artist = artist;
        this.listPlaylist = listPlaylist;
        this.listAlbum = listAlbum;
        this.urlMusic = urlMusic;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Integer> getListPlaylist() {
        return listPlaylist;
    }

    public void setListPlaylist(List<Integer> listPlaylist) {
        this.listPlaylist = listPlaylist;
    }

    public List<String> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(List<String> listAlbum) {
        this.listAlbum = listAlbum;
    }

    public String getUrlMusic() {
        return urlMusic;
    }

    public void setUrlMusic(String urlMusic) {
        this.urlMusic = urlMusic;
    }
}
