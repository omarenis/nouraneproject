package com.noura.nourane.models.repositories;

import com.noura.nourane.models.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findBySubject(String subject);
    List<Appointment> findByAvailability_AvailabilityId(Long availability);
    List<Appointment> findByCreationDate(Date dateCreation);

}
