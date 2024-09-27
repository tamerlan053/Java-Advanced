package be.pxl.musicplaylist.api;

import be.pxl.musicplaylist.MusicPlaylistApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlist")
public class PlaylistController {
    private static final Logger LOGGER = LogManager.getLogger(PlaylistController.class);
    private final MusicPlaylistService musicPlaylistService;

    public PlaylistController(MusicPlaylistService musicPlaylistService) {
        this.musicPlaylistService = musicPlaylistService;
    

    @GetMapping("songs")
    public List<Song> getAllSongs() {
        return musicPlaylistService.getAllSongs();
    }

    @GetMapping("songs/{genre}")
    public List<Song> gettAllSongsByGenre(@PathVariable Genre genre) {
        return musicPlaylistService.getAllSongsByGenre(genre);
    }
}
