package com.mypromotions.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chatbot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String responseTemplate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResponseTemplate() {
		return responseTemplate;
	}
	public void setResponseTemplate(String responseTemplate) {
		this.responseTemplate = responseTemplate;
	}
	public void setScript(Object script) {
		// TODO Auto-generated method stub
		
	}

    // getters and setters
}

