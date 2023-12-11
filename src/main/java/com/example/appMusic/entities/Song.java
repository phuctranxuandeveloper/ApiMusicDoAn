package com.example.appMusic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Date;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "songId")
    private int songId;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "releaseDate")
    private Date releaseDate;

    @Basic
    @Column(name = "duration")
    private Time duration;

    @Basic
    @Column(name = "avatar")
    private String avatar;

    @Basic
    @Column(name = "url_music")
    private String urlMusic;

    @ManyToMany(mappedBy = "songsPl", fetch = FetchType.LAZY)
    private List<Playlist> playlists;

    @ManyToOne
    @JoinColumn(name = "genreId")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "artistId")
    private Artist artist;

    @ManyToMany(mappedBy = "songsAb", fetch = FetchType.LAZY)
    private List<Album> albums;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
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

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String getUrlMusic() {
        return urlMusic;
    }

    public void setUrlMusic(String urlMusic) {
        this.urlMusic = urlMusic;
    }
}
