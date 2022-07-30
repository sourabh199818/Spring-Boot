package com.example.jwt.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class StudentDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        if(userName.equals("Saurabh"))
        {
            return new User("Saurabh", "sourabh123",new ArrayList<>());
        }else {
            throw new UsernameNotFoundException("user not found");
        }

    }
}
