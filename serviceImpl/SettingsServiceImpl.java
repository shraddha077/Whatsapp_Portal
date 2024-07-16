package com.mypromotions.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.model.User;
import com.mypromotions.repository.UserRepository;
import com.mypromotions.service.SettingsService;
import com.mypromotions.service.UserService;


@Service
public class SettingsServiceImpl implements SettingsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User updateAccountPreferences(Long userId, UserService userService) {
        return userRepository.findById(userId).map(user -> {
            user.setUsername(UserService.getUsername());
            user.setEmail(UserService.getEmail());
            return userRepository.save(user);
        }).orElse(null);
    }

    @Override
    public User updateNotificationPreferences(Long userId, UserService userServices) {
        return userRepository.findById(userId).map(user -> {
            user.setNotificationPreferences(UserService.getNotificationPreferences());
            return userRepository.save(user);
        }).orElse(null);
    }

    @Override
    public User updatePrivacySettings(Long userId, User UserService) {
        return userRepository.findById(userId).map(user -> {
            user.setPrivacySettings(UserService.getPrivacySettings());
            return userRepository.save(user);
        }).orElse(null);
    }

    @Override
    public User updateSettings(User user) {
        return userRepository.save(user);
    }

	@Override
	public User updateAccountPreferences(Long userId, UserRepository userRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateNotificationPreferences(Long userId, UserRepository userRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updatePrivacySettings(Long userId, UserRepository userRepository) {
		// TODO Auto-generated method stub
		return null;
	}
}
