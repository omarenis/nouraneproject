package com.noura.nourane.models.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
public class Appointment {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)  @Getter @Setter private Long id;
    @Getter @Setter @ManyToOne @JoinColumn(name = "patient") private Patient patient;
    @Column(name = "subject") @Getter @Setter private String subject;
    @ManyToOne @JoinColumn(name = "availability") @Getter @Setter private Availability availability;
    @Getter @Setter private boolean status;
}
