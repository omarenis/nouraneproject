package com.noura.nourane.models.repositories;

import com.noura.nourane.models.entities.Patient;
import com.noura.nourane.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> { }
