package com.example.lesson3.controller;

import com.example.lesson3.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<?> createAccount(@RequestParam String username, @RequestParam String password) {
        return ResponseEntity.ok(accountService.createAccount(username,password));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        return  ResponseEntity.ok(accountService.login(username,password));
    }

    @PostMapping("/change_password")
    public ResponseEntity<?> changePassword(@RequestParam String token, @RequestParam String newPassword) {
        accountService.changePassword(token,newPassword);
        return ResponseEntity.ok("Password changed");
    }
}
