package com.noura.nourane.services.implementations;

import com.noura.nourane.models.entities.Appointment;
import com.noura.nourane.models.entities.Doctor;
import com.noura.nourane.models.repositories.AppointmentRepository;
import com.noura.nourane.models.repositories.DoctorRepository;
import com.noura.nourane.models.repositories.PatientRepository;
import com.noura.nourane.services.interfaces.AppointmentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService implements AppointmentServiceInterface {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(DoctorRepository doctorRepository, PatientRepository patientRepository,
                              AppointmentRepository appointmentRepository)
    {
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> list() {
        return this.appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> findBy(String subject) {
        return this.appointmentRepository.findBySubject(subject);
    }

    @Override
    public List<Appointment> findBy(Long user, String typeUser) {
        if(typeUser.equals("doctor"))
        {
            Optional<Doctor> doctor = doctorRepository.findById(user);
            if(doctor.isPresent())
            {

            }
        }
    }

    @Override
    public List<Appointment> findBy() {
        return null;
    }

    @Override
    public Appointment create(Appointment appointment) {
        return null;
    }

    @Override
    public Appointment update(Long id, Appointment appointment) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
