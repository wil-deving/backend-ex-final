package com.demoprogra.progratres.controller;

import com.demoprogra.progratres.data.dto.Auth.UserAuthDto;
import com.demoprogra.progratres.service.User.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("v1/auth")
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public @ResponseBody
    Map<String, Object> authWebApp(@RequestBody UserAuthDto userAuthDto) {
        Map<String, Object> responseDto = new HashMap<String, Object>();
        responseDto.put("auth", false);
        responseDto.put("message", "Usuario o password incorrectos");
        responseDto.put("userData", null);

        Map<String, String> foundUser = userService.getUserAuth(userAuthDto.getUser(), userAuthDto.getPass());

        if (foundUser == null || foundUser.size() == 0 || foundUser.isEmpty()) return responseDto;

        responseDto.put("auth", true);
        responseDto.put("message", "Login existoso");
        responseDto.put("userData", foundUser);

        return responseDto;
    }

    /*
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
     */

}
