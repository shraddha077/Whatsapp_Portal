package com.mypromotions.serviceImpl;

import com.mypromotions.model.Campaign;
import com.mypromotions.repository.CampaignRepository;
import com.mypromotions.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignServiceImpl implements CampaignService {

    @Autowired
    private CampaignRepository campaignRepository;

    @Override
    public Campaign createCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    @Override
    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    @Override
    public Campaign getCampaignById(Long id) {
        Optional<Campaign> campaign = campaignRepository.findById(id);
        return campaign.orElse(null);
    }

    @Override
    public Campaign updateCampaign(Long id, Campaign campaign) {
        if (campaignRepository.existsById(id)) {
            campaign.setId(id);
            return campaignRepository.save(campaign);
        } else {
            return null;
        }
    }

    @Override
    public void deleteCampaign(Long id) {
        campaignRepository.deleteById(id);
    }

	@Override
	public Campaign createCampaign() {
		// TODO Auto-generated method stub
		return null;
	}
}
