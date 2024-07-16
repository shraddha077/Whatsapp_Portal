package com.mypromotions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mypromotions.service.ExportParticipantsService;

import java.util.List;

@RestController
@RequestMapping("/api/export")
public class ExportParticipantsController {

    @Autowired
    private ExportParticipantsService exportParticipantsService;

    @GetMapping("/participants")
    public List<String> exportParticipants() {
        return exportParticipantsService.exportParticipants();
    }
}
