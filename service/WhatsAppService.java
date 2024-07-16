package com.mypromotions.service;



import java.util.List;

import com.mypromotions.model.WhatsAppInstance;
import com.mypromotions.repository.WhatsAppInstanceRepository;

public interface WhatsAppService {
    WhatsAppInstance createInstance(WhatsAppInstanceRepository instanceRepository);
    WhatsAppInstance getInstanceById(Long id);
    List<WhatsAppInstance> getAllInstances();
    void deleteInstance(Long id);
	List<WhatsAppInstance> findAll();
	WhatsAppInstance findById(Long id);
	WhatsAppInstance save(WhatsAppInstance whatsappInstance);
	void deleteById(Long id);
	WhatsAppInstance createInstance(WhatsAppInstance instanceService);
}

