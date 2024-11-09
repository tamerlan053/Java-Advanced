package be.pxl.musicplaylist.api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicPlaylistService {
    private final List<Song> myPlaylist = new ArrayList<>();

    public void addSong(Song song) {
        myPlaylist.add(song);
    }

    public List<Song> getSongs() {
        return myPlaylist;
    }

    public List<Song> getSongsByGenre(Genre genre) {
        List<Song> response = new ArrayList<>();
        for (Song song : myPlaylist) {
            if (song.getGenre() == genre) {
                response.add(song);
            }
        }
        return response;
    }

    public void upadteSong(int index, Song song) {
        myPlaylist.set(index, song);
    }

    public void deleteSong(int index) {
        myPlaylist.remove(index);
    }
}