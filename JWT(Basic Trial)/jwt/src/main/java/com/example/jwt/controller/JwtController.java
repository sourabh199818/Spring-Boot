package com.example.jwt.controller;

//importing required library 
import com.example.jwt.Helper.JwtUtil;
import com.example.jwt.model.JwtRequest;
import com.example.jwt.model.JwtResponse;
import com.example.jwt.services.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//Annotations

@RestController
public class JwtController {

    @Autowired
    private StudentDetailsService studentDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;


    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {

       System.out.println(jwtRequest);
       try {
           this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));

       }catch (UsernameNotFoundException e)
       {
           e.printStackTrace();
           throw new Exception("bad credentials");
       }catch(BadCredentialsException e){
           e.printStackTrace();
           throw new Exception("bad");
       }
       UserDetails userDetails =this.studentDetailsService.loadUserByUsername(jwtRequest.getUsername());
      String token = this.jwtUtil.generateToken(userDetails);
       System.out.println("JWT_" +token);

       return ResponseEntity.ok(new JwtResponse(token));
    }

}
