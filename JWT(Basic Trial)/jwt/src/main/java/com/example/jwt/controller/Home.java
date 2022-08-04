package com.example.jwt.controller;

//importing required library 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Annotations

@RestController
public class Home {

    @RequestMapping("/welcome")
    public String Welcome()
    {
        String text = "this is private page ";
        text+="this page isn't allowed to unauthenticated ";

        return text;
    }
}
