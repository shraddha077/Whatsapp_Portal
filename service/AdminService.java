package com.mypromotions.service;

import com.mypromotions.model.User;
import java.util.List;

public interface AdminService {
    User createMarketer(User user);
    List<User> getAllMarketers();
    void deleteMarketer(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
    User createUser(User user);
}
