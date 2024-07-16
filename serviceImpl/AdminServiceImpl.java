package com.mypromotions.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.model.User;
import com.mypromotions.repository.UserRepository;
import com.mypromotions.service.AdminService;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createMarketer(User user) {
        // Your logic to create a marketer
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllMarketers() {
        // Your logic to get all marketers
        return userRepository.findAll();
    }

    @Override
    public void deleteMarketer(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
