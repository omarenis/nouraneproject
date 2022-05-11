package com.noura.nourane.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class  Availability {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column(name = "dateTime") @Getter @Setter private Date dateTime;
    @ManyToOne @Getter @Setter private Doctor doctor;
    @OneToMany @Getter @Setter private List<Appointment> appointments;
}
