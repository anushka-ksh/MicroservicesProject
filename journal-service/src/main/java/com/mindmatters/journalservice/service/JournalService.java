package com.mindmatters.journalservice.service;

import com.mindmatters.journalservice.model.JournalEntry;
import com.mindmatters.journalservice.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public JournalEntry saveJournalEntry(JournalEntry journalEntry) {
        journalEntry.setDate(LocalDateTime.now());
        return journalRepository.save(journalEntry);
    }

    public List<JournalEntry> getEntries(String userId) {
        return journalRepository.findByUserId(userId);
    }

}
