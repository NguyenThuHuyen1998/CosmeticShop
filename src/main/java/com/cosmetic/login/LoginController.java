package com.cosmetic.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping(value = "/login")
    public ResponseEntity<String> login(String username, String password){

        return ResponseEntity.ok("Success");
    }

    @PostMapping(value = "/account")
    public AccountDTO createAccount(@RequestBody AccountDTO account){
        return account;
    }

    @PutMapping(value = "/account")
    public AccountDTO updateAccount(@RequestBody AccountDTO account){
        return account;
    }

}
