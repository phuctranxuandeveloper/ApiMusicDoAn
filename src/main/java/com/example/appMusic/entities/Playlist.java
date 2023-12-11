package com.example.appMusic.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "playlists", schema = "apiappmusic")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlistId")
    private int playlistId;

    @Basic
    @Column(name = "name")
    private String name;

    @OneToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "playlistsong",
            joinColumns = @JoinColumn(name = "playlistId", referencedColumnName = "playlistId"),
            inverseJoinColumns = @JoinColumn(name = "songId", referencedColumnName = "songId")
    )
    private List<Song> songsPl;

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Song> getSongsPl() {
        return songsPl;
    }

    public void setSongsPl(List<Song> songsPl) {
        this.songsPl = songsPl;
    }
}
