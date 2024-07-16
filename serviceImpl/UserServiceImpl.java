package com.mypromotions.serviceImpl;

import com.mypromotions.model.User;
import com.mypromotions.repository.UserRepository;
import com.mypromotions.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUsername(updatedUser.getUsername());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            return userRepository.save(user);
        }
        return null; // Or throw an exception if desired
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

	@Override
	public User updateUser(Long id, UserRepository userRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<org.apache.catalina.User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.apache.catalina.User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.apache.catalina.User save(org.apache.catalina.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
}
