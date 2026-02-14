package com.mindmatters.journalservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindmatters.journalservice.model.JournalEntry;

import java.util.List;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> {
    List<JournalEntry> findByUserId(String userId);

}
