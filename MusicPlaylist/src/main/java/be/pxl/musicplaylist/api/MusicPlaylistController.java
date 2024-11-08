package be.pxl.musicplaylist.api;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("playlist/songs")
public class MusicPlaylistController {
    private static final Logger LOGGER = LogManager.getLogger(MusicPlaylistController.class);
    private final MusicPlaylistService musicPlaylistService;

    @Autowired
    public MusicPlaylistController(MusicPlaylistService playlistService) {
        this.musicPlaylistService = playlistService;
    }

    @PostMapping
    public void addSong(@RequestBody Song song) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Adding song [" + song.getTitle() + "]");
        }
        musicPlaylistService.addSong(song);
    }

    @GetMapping
    public List<Song> getSongs() {
        return musicPlaylistService.getSongs();
    }

        @GetMapping("{genre}")
    public List<Song> getSongs(@PathVariable Genre genre) {
        return musicPlaylistService.getSongsByGenre(genre);
    }
}