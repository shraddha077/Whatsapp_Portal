package com.mypromotions.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.repository.CampaignRepository;
import com.mypromotions.repository.ContactRepository;
import com.mypromotions.service.ContactService;
import com.mypromotions.service.ExportParticipantsService;



@Service
public class ExportParticipantsServiceImpl implements ExportParticipantsService {

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<ContactService> exportContacts(Long campaignId) {
        // Logic to export contacts
        return List.of();
    }

    @Override
    public List<ContactService> exportData(Long userId) {
        // Logic to export data
        return List.of();
    }

	@Override
	public List<String> exportParticipants() {
		// TODO Auto-generated method stub
		return null;
	}

	public CampaignRepository getCampaignRepository() {
		return campaignRepository;
	}

	public void setCampaignRepository(CampaignRepository campaignRepository) {
		this.campaignRepository = campaignRepository;
	}

	public ContactRepository getContactRepository() {
		return contactRepository;
	}

	public void setContactRepository(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
}

