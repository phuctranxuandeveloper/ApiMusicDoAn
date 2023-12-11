package com.example.appMusic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumId")
    private int albumId;

    @Basic
    @Column(name = "title")
    @Getter
    private String title;

    @Basic
    @Column(name = "releaseDate")
    @Getter
    private Date releaseDate;

    @Basic
    @Column(name = "duration")
    @Getter
    private Time duration;

    @ManyToOne
    @JoinColumn(name = "artistId")
    @Getter
    private Artist artist;

    @Basic
    @Column(name = "avatar")
    @Getter
    private String avatar;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "albumsong",
            joinColumns = @JoinColumn(name = "albumId", referencedColumnName = "albumId"),
            inverseJoinColumns = @JoinColumn(name = "songId", referencedColumnName = "songId")
    )
    @Getter
    private List<Song> songsAb;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Song> getSongsAb() {
        return songsAb;
    }

    public void setSongsAb(List<Song> songsAb) {
        this.songsAb = songsAb;
    }
}
