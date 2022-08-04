package com.example.jwt.config;

//Importing required library 
import com.example.jwt.Helper.JwtUtil;
import com.example.jwt.services.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Annotation
@Component
public class JWTAuthen extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private StudentDetailsService studentDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String requestTokenHeader =  request.getHeader("Authorization");
        String username =null;
        String jwtToken =null;

        if (requestTokenHeader!=null && requestTokenHeader.startsWith("Bearer")){

            jwtToken = requestTokenHeader.substring(7);

        try{
            username= this.jwtUtil.extractUsername(jwtToken);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
       UserDetails userDetails = this.studentDetailsService.loadUserByUsername(username);
        if(username!=null && SecurityContextHolder.getContext().getAuthentication() ==null)
        {
             UsernamePasswordAuthenticationToken   usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            usernamePasswordAuthenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);

        }else
        {
            System.out.println("this is not valid ");
        }



        }
        filterChain.doFilter(request,response);
    }

}
