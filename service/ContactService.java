package com.mypromotions.service;


import java.util.List;

import com.mypromotions.model.Contact;
import com.mypromotions.repository.ContactRepository;

public interface ContactService {
    Contact addContact(ContactRepository contactRepository);
    Contact getContactById(Long id);
    List<Contact> getAllContacts();
    void deleteContact(Long id);
	
	Contact save(Contact contact);
	Contact findById(Long id);
	List<Contact> findAll();
	void deleteById(Long id);
	Contact addContact(Contact contact);
	Contact updateContact(Long id, Contact contact);
	Contact createContact(Contact contact);
}

