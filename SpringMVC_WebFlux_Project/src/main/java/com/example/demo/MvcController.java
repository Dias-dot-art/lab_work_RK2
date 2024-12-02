
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvc")
public class MvcController {

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        Thread.sleep(100); // Simulate delay
        return "Hello from MVC!";
    }
}
