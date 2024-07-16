package com.mypromotions.repository;

import com.mypromotions.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByName(String name); // This method should match the property in the Contact entity
}
