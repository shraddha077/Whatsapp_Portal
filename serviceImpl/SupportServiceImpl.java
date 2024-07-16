package com.mypromotions.serviceImpl;

import org.springframework.stereotype.Service;

import com.mypromotions.repository.UserRepository;
import com.mypromotions.service.SupportService;
import com.mypromotions.service.UserService;

@Service
public class SupportServiceImpl implements SupportService {

    @Override
    public void createSupportTicket(UserService userService, String issueDescription) {
        // Logic to create support ticket
    }

    @Override
    public void resolveSupportTicket(Long ticketId) {
        // Logic to resolve support ticket
    }

	@Override
	public void createSupportTicket(UserRepository userRepository, String issueDescription) {
		// TODO Auto-generated method stub
		
	}
}
