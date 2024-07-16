package com.mypromotions.service;



import java.util.List;

import com.mypromotions.model.User;
import com.mypromotions.repository.UserRepository;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, UserRepository userRepository);
    void deleteUser(Long id);
	List<org.apache.catalina.User> findAll();
	org.apache.catalina.User findById(Long id);
	org.apache.catalina.User save(org.apache.catalina.User user);
	void deleteById(Long id);
	static Object getNotificationPreferences() {
		// TODO Auto-generated method stub
		return null;
	}
	static String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	static String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	User updateUser(Long id, User updatedUser);
}

