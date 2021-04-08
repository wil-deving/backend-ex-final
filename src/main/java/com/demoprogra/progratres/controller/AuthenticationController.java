package com.demoprogra.progratres.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("v1/auth")
public class AuthenticationController {

    @GetMapping()
    public String getToken() {
        Calendar expDate = Calendar.getInstance();
        expDate.add(Calendar.MINUTE, 1440);
        String tokenOutput = Jwts.builder()
                .setSubject("myId")
                .claim("keyOne", "valueOne")
                .setIssuedAt(new Date())
                .setExpiration(expDate.getTime())
                .signWith(SignatureAlgorithm.HS256, "secretVal")
                .compact();
        return tokenOutput;

    }

}
