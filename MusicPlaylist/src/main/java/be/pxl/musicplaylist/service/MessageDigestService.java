package be.pxl.musicplaylist.service;

import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class MessageDigestService {
    public String calculateHash(String algorithm, String original) throws NoSuchAlgorithmException {
        MessageDigest md;
        md = MessageDigest.getInstance(algorithm);
        md.update(original.getBytes());
        byte[] digest = md.digest();
        StringBuilder result = new StringBuilder();
        for (byte b : digest) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}
