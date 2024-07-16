package com.mypromotions.service;

import java.util.List;

import com.mypromotions.model.LinkGenerator;
import com.mypromotions.repository.LinkGeneratorRepository;

public interface LinkGeneratorService {
    LinkGenerator generateLink(LinkGeneratorRepository linkGeneratorRepository);
    LinkGenerator getLinkById(Long id);
	List<LinkGenerator> findAll();
	LinkGenerator findById(Long id);
	LinkGenerator save(LinkGenerator linkGenerator);
	void deleteById(Long id);
	LinkGenerator generateLink(LinkGeneratorService linkGeneratorDTO);
	String getUrl();
	List<LinkGenerator> getAllLinks();
}

