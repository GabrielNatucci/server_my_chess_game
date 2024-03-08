package com.natuccischessserver.chess_server.token;

import java.security.SecureRandom;
import java.util.Base64;

public class Token {
    private static final SecureRandom secureRandom = new SecureRandom(); // threadsafe
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); // threadsafe

    public static String generateNewToken() {
        byte[] randomBytes = new byte[24];
        secureRandom.nextBytes(randomBytes);
        System.out.println(base64Encoder.encodeToString(randomBytes));
        System.out.println(base64Encoder.encodeToString(randomBytes).length());
        return base64Encoder.encodeToString(randomBytes);
    }
}
