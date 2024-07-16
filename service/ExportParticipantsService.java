package com.mypromotions.service;


import java.util.List;


public interface ExportParticipantsService {
    List<ContactService> exportContacts(Long campaignId);
    List<ContactService> exportData(Long userId);
	List<String> exportParticipants();
}
