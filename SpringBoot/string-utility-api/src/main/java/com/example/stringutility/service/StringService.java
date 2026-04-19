package com.example.stringutility.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    // Reverse string
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // Convert to Uppercase
    public String toUpper(String input) {
        return input.toUpperCase();
    }

    // Convert to Lowercase
    public String toLower(String input) {
        return input.toLowerCase();
    }

    // Count characters
    public int countCharacters(String input) {
        return input.length();
    }
}