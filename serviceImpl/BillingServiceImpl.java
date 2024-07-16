package com.mypromotions.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypromotions.model.Subscription;
import com.mypromotions.repository.SubscriptionRepository;
import com.mypromotions.service.BillingService;

@Service
public  class BillingServiceImpl implements BillingService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public Subscription createSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription getSubscriptionById(Long id) {
        return subscriptionRepository.findById(id).orElse(null);
    }

    @Override
    public void cancelSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }

    @Override
    public Subscription subscribe(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription getSubscription(Long id) {
        return subscriptionRepository.findById(id).orElse(null);
    }

	@Override
	public SubscriptionRepository createSubscription(SubscriptionRepository subscriptionRepository) {
		// TODO Auto-generated method stub
		return null;
	}
}
