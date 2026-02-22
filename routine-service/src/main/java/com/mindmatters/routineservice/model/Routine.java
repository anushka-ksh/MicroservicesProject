package com.mindmatters.routineservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "routines")
public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId; // Changed from UserId (capital U breaks Spring Data)
    private String habitName; // Changed from habitname (good practice)
    private String frequency;

    private boolean completed;
}