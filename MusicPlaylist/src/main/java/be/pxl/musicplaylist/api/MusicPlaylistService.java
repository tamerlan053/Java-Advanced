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

    public List<Song> getAllSongs() {
        return myPlaylist;
    }

    public List<Song> getAllSongsByGenre(Genre genre) {
        return myPlaylist.stream().filter(s -> s.getGenre() == genre).toList();
    }
}
