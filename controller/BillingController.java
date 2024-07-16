package com.mypromotions.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.model.Subscription;
import com.mypromotions.service.BillingService;

@RestController
@RequestMapping("/api/billing")
public class BillingController {

    @Autowired
    private BillingService billingService;

    @PostMapping("/subscribe")
    public Subscription subscribe(@RequestBody Subscription subscription) {
        return billingService.subscribe(subscription);
    }

    @GetMapping("/subscription/{id}")
    public Subscription getSubscription(@PathVariable Long id) {
        return billingService.getSubscription(id);
    }
}
