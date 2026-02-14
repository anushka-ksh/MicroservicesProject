package com.mindmatters.journalservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.mindmatters.journalservice.model.JournalEntry;
import com.mindmatters.journalservice.service.JournalService;

@RestController
@RequestMapping("/api/journals")
public class JournalController {

    @Autowired
    private JournalService journalService;

    @PostMapping
    public JournalEntry journalEntry(@RequestBody JournalEntry journalEntry) {
        return journalService.saveJournalEntry(journalEntry);
    }

    @GetMapping("/user/{userId}")
    public List<JournalEntry> getEntries(@PathVariable String userId) {
        return journalService.getEntries(userId);
    }

}