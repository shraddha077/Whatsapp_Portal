package com.mypromotions.service;

import com.mypromotions.model.User;
import com.mypromotions.repository.UserRepository;

public interface SettingsService {
    User updateAccountPreferences(Long userId, UserRepository userRepository);
    User updateNotificationPreferences(Long userId, UserRepository userRepository);
    User updatePrivacySettings(Long userId, UserRepository userRepository);
	User updateSettings(User user);
	User updatePrivacySettings(Long userId, User userDTO);
	User updateNotificationPreferences(Long userId, UserService userServices);
	User updateAccountPreferences(Long userId, UserService userService);
}

