package com.mypromotions.service;

import com.mypromotions.repository.UserRepository;

public interface SupportService {
    void createSupportTicket(UserRepository userRepository, String issueDescription);
    void resolveSupportTicket(Long ticketId);
	static void ContactSupport(String message) {
		// TODO Auto-generated method stub
		
	}
	static void ontactSupport(String message) {
		// TODO Auto-generated method stub
		
	}
	void createSupportTicket(UserService userService, String issueDescription);
}

