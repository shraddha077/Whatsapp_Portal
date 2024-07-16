package com.mypromotions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.User;
import com.mypromotions.repository.UserRepository;
import com.mypromotions.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserRepository userRepository) {
        User registeredUser = authService.register(userRepository);
        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestParam String username, @RequestParam String password) {
        User token = authService.login(username, password);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/send-otp")
    public ResponseEntity<Void> sendOTP(@RequestParam String email) {
        authService.sendOTP(email);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<Boolean> verifyOTP(@RequestParam String email, @RequestParam String otpCode) {
        boolean isVerified = authService.verifyOTP(email, otpCode);
        return ResponseEntity.ok(isVerified);
    }
}
