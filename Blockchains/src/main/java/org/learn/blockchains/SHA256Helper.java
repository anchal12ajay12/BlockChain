package org.learn.blockchains;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256Helper {
    public static String generateHash(String data) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexadecimalString = new StringBuilder();
            for (byte b : hash) {
                String hexadecimal = Integer.toHexString(0xff & b);
                if (hexadecimal.length() == 1) hexadecimalString.append('0');
                hexadecimalString.append(hexadecimal);
            }
            return hexadecimalString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
