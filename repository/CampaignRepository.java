package com.mypromotions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mypromotions.model.Campaign;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    List<Campaign> findByName(String name);
}
