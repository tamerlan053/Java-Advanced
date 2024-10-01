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
        List<Song> songsByGenre = new ArrayList<>();
        for (Song song: myPlaylist) {
            if (song.getGenre() == genre) {
                songsByGenre.add(song);
            }
        }
        return songsByGenre;
    }
}
