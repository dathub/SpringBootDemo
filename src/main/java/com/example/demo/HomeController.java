package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dumindut on 6/19/2019.
 */
@RestController
public class HomeController {
    @GetMapping
    public String greeting(@RequestParam(required = false,
            defaultValue = "") String name) {
        return name.equals("") ? "Hey!" : "Hey, " + name + "!";
    }
}
