package be.pxl.musicplaylist.api;

import be.pxl.musicplaylist.service.MessageDigestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/hash")
public class MessageController {
    private final MessageDigestService messageDigestService;

    public MessageController(MessageDigestService messageDigestService) {
        this.messageDigestService = messageDigestService;
    }

    @PostMapping
    public ResponseEntity<String> calculateHash(@RequestBody CalculateHashRequest request) {
        
    }
}
