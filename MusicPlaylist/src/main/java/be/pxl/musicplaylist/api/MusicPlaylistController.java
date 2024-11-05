package be.pxl.musicplaylist.api;

import org.apache.logging.log4j.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(".playlist/songs")
public class MusicPlaylistController {
    private static final Logger LOGGER = LogManager.getLogger(MusicPlaylistController.class);

    @PostMapping
    public void addSong(@RequestBody Song song) {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("Adding song [" + song.getTitle() + "]");
        }
    }
}
