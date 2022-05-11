package com.noura.nourane.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)  @Getter @Setter private Long id;
    @Getter @Setter @ManyToOne @JoinColumn(name = "patient") private Patient patient;
    @Column(name = "subject") @Getter @Setter private String subject;
    @ManyToOne @JoinColumn(name = "disponibility") @Getter @Setter private Availability disponibility;
}
