package com.mypromotions.service;

import com.mypromotions.model.Campaign;

import java.util.List;

public interface CampaignService {
    List<Campaign> getAllCampaigns();
    Campaign getCampaignById(Long id);
    Campaign createCampaign(Campaign campaign);
    Campaign updateCampaign(Long id, Campaign campaign);
    void deleteCampaign(Long id);
	Campaign createCampaign();
}