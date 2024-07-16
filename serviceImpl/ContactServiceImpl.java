package com.mypromotions.serviceImpl;

import com.mypromotions.model.Contact;
import com.mypromotions.repository.ContactRepository;
import com.mypromotions.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContactById(Long id) {
        Optional<Contact> contact = contactRepository.findById(id);
        return contact.orElse(null);
    }

    @Override
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Contact updateContact(Long id, Contact contact) {
        if (contactRepository.existsById(id)) {
            contact.setId(id);
            return contactRepository.save(contact);
        } else {
            return null;
        }
    }

    @Override
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }

	@Override
	public Contact addContact(ContactRepository contactRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact save(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact addContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}
}
