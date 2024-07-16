package com.mypromotions.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.model.WhatsAppInstance;
import com.mypromotions.repository.WhatsAppInstanceRepository;
import com.mypromotions.service.WhatsAppService;

import java.util.List;

@Service
public class WhatsAppServiceImpl implements WhatsAppService {

    @Autowired
    private WhatsAppInstanceRepository whatsAppInstanceRepository;

    @Override
    public WhatsAppInstance createInstance(WhatsAppInstance instanceService) {
        WhatsAppInstance instance = new WhatsAppInstance();
        instance.setInstanceName(WhatsAppInstance.getInstanceName());
        instance.setPhoneNumber(instanceService.getPhoneNumber());
        return whatsAppInstanceRepository.save(instance);
    }

    @Override
    public WhatsAppInstance getInstanceById(Long id) {
        return whatsAppInstanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<WhatsAppInstance> getAllInstances() {
        return whatsAppInstanceRepository.findAll();
    }

    @Override
    public void deleteInstance(Long id) {
        whatsAppInstanceRepository.deleteById(id);
    }

	@Override
	public WhatsAppInstance createInstance(WhatsAppInstanceRepository instanceRepository) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WhatsAppInstance> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WhatsAppInstance findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WhatsAppInstance save(WhatsAppInstance whatsappInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}
}
