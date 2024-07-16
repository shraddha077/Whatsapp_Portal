package com.mypromotions.service;


import com.mypromotions.model.User;
import com.mypromotions.repository.UserRepository;

public interface AuthService {
    User register(UserRepository userRepository);
    User login(String username, String password);
    void sendOTP(String email);
    boolean verifyOTP(String email, String otpCode);
	User register(User user);
}
