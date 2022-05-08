package com.noura.nourane.models.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity(name="doctors")
@DiscriminatorValue("patient")
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Doctor extends User {
    @Column(name = "speciality") @Getter @Setter @NotNull private String speciality;
    @OneToMany List<Appointment> appointments;
}
