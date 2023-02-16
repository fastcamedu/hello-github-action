package com.fastcampus.sonic.hellogithubaction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.of(Optional.of("Hello, Github Actions"));
    }
}
