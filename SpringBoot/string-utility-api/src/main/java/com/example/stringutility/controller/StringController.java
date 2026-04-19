package com.example.stringutility.controller;

import com.example.stringutility.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/string")
public class StringController {

    @Autowired
    private StringService service;

    // Reverse
    @GetMapping("/reverse")
    public String reverse(@RequestParam String input) {
        return service.reverse(input);
    }

    // Uppercase
    @GetMapping("/uppercase")
    public String uppercase(@RequestParam String input) {
        return service.toUpper(input);
    }

    // Lowercase
    @GetMapping("/lowercase")
    public String lowercase(@RequestParam String input) {
        return service.toLower(input);
    }

    // Count Characters
    @GetMapping("/count")
    public int count(@RequestParam String input) {
        return service.countCharacters(input);
    }
}