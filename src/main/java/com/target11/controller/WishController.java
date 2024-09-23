package com.target11.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wish")
public class WishController {

    @GetMapping("/{name}")
    public String wishMessage(@PathVariable String name) {
        return "Hello, "+ name +"! This is the wish message.";
    }

}
