package com.mypromotions.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypromotions.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

	List<Message> findByCampaignId(Long campaignId);
}
