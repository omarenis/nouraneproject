package com.noura.nourane.services.interfaces;

import com.noura.nourane.models.entities.Appointment;

import java.util.List;

public interface AppointmentServiceInterface {
    public List<Appointment> list();
    public List<Appointment> findBy(String subject);
    public List<Appointment> findBy(Long user, String typeUser);
    public List<Appointment> findBy();

    public Appointment create(Appointment appointment);

    public Appointment update(Long id, Appointment appointment);

    public void delete(Long id);
}
