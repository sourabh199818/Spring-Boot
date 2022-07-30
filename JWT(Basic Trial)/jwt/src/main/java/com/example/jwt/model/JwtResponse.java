package com.example.jwt.model;

public class JwtResponse {
    String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public JwtResponse() {
    }

    public JwtResponse(String token) {
        this.token = token;
    }
}
