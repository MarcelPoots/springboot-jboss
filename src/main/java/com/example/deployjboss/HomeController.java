package com.example.deployjboss;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * HomeController
 */
@RestController
@RequestMapping("/")
public class HomeController {
    public HomeController() {
    }

    @GetMapping
    public String getString() {
        return "Hello World " + new Date();
    }
}
