package com.kmap.kmp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/map")
public class MapController {

    @GetMapping("/test")
    public String helloWorld() {
        return "hello!";
    }
}