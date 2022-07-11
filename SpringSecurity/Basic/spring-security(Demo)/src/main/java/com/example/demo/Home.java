package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Home {
    @RestController
    public class HomeResource {

        @GetMapping("/")
        public String home() {
            return ("<h1>Welcome</h1>");
        }

        @GetMapping("/user")
        public String user() {
            return ("<h1>Welcome Student</h1>");
        }

        @GetMapping("/admin")
        public String admin() {
            return ("<h1>Welcome Teacher</h1>");
        }
    }
}
