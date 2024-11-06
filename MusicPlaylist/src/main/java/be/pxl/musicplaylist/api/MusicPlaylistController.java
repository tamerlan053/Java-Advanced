package be.pxl.musicplaylist.api;

import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Song> getAllSongs() {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Fetching all songs from the playlist");
        }
        List<Song> songs = musicPlaylistService.getAllSongs();
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Retrieved " + songs.size() + " songs from the playlist");
        }
        return songs;
    }
}