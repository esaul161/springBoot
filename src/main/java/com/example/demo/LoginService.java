package com.example.demo;

import org.springframework.stereotype.Component;

//Spring Bean
@Component
public class LoginService {

    public boolean validateUser(String userid, String password){
        System.out.println(userid + " " +password);
        return userid.equalsIgnoreCase("Pedro") && password.equalsIgnoreCase("12345");
    }
}
