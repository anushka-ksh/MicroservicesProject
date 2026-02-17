package com.mindmatters.routineservice.model;

import java.lang.annotation.Inherited;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "routines")
public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String UserId;
    private String habitname;
    private String frequency;

    private boolean completed;
}
