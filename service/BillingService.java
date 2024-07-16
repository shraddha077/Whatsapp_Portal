package com.mypromotions.service;

import com.mypromotions.model.Subscription;
import com.mypromotions.repository.SubscriptionRepository;

public interface BillingService {
    SubscriptionRepository createSubscription(SubscriptionRepository subscriptionRepository);
    Subscription getSubscriptionById(Long id);
    void cancelSubscription(Long id);
	Subscription subscribe(Subscription subscription);
	Subscription getSubscription(Long id);
	Subscription createSubscription(Subscription subscription);
}
