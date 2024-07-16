package com.mypromotions.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.service.SupportService;

@RestController
@RequestMapping("/api/support")
public class SupportController {

    @Autowired
    private SupportService supportService;

    @PostMapping("/contact-support")
    public void contactSupport(@RequestBody String message) {
        SupportService.ontactSupport(message);
    }

	public SupportService getSupportService() {
		return supportService;
	}

	public void setSupportService(SupportService supportService) {
		this.supportService = supportService;
	}
}

