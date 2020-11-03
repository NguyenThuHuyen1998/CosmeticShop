package com.cosmetic;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeAPI {

    @GetMapping("/home/test")
    public ResponseEntity<String> testAPI(){
        return ResponseEntity.ok("Success");
    }

}
