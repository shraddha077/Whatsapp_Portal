package com.mypromotions.service;

import java.util.List;

import com.mypromotions.model.Autoresponder;
import com.mypromotions.repository.AutoresponderRepository;

public interface AutoresponderService {
    Autoresponder createAutoresponder(AutoresponderRepository autoresponderRepository);
    Autoresponder getAutoresponderById(Long id);
    void deleteAutoresponder(Long id);
	
	Autoresponder findById(Long id);
	List<Autoresponder> findAll();
	Autoresponder save(Autoresponder autoresponder);
	void deleteById(Long id);
	Autoresponder createAutoresponder(Autoresponder autoresponder);
}
