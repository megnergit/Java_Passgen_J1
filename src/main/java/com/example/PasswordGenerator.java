package com.example;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generateFormattedPassword() {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 25; i++) {
            if (i > 0 && i % 5 == 0) {
                password.append('-');
            }
            password.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("Generated Password: " + generateFormattedPassword());
    }
}
