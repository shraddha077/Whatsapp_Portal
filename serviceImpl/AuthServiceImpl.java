package com.mypromotions.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.model.OTP;
import com.mypromotions.model.User;
import com.mypromotions.repository.OTPRepository;
import com.mypromotions.repository.UserRepository;
import com.mypromotions.service.AuthService;
import com.mypromotions.utils.OTPGenerator;

import java.util.Optional;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OTPRepository otpRepository;

    @Autowired
    private OTPGenerator otpGenerator;  // Corrected field type

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public User login(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
            return user.get();
        } else {
            return null;
        }
    }

    @Override
    public void sendOTP(String email) {
        String otpCode = otpGenerator.generateOTP();  // Use the correct bean
        OTP otp = new OTP();
        otp.setEmail(email);
        otp.setCode(otpCode);
        otpRepository.save(otp);
    }

    @Override
    public boolean verifyOTP(String email, String otpCode) {
        OTP otp = otpRepository.findByEmail(email);
        if (otp != null && otp.getCode().equals(otpCode)) {
            return true;
        } else {
            return false;
        }
    }

	@Override
	public User register(UserRepository userRepository) {
		// TODO Auto-generated method stub
		return null;
	}
}
