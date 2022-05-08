package com.noura.nourane.models.repositories;

import com.noura.nourane.models.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> { }
