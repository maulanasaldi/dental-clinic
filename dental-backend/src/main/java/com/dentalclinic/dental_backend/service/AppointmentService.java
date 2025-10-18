package com.dentalclinic.dental_backend.service;

import com.dentalclinic.dental_backend.entity.Appointment;
import com.dentalclinic.dental_backend.repository.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository repository;

    public AppointmentService(AppointmentRepository repository) {
        this.repository = repository;
    }

    public List<Appointment> getAll() {
        return repository.findAll();
    }

    public Appointment getById(Long id) {
        return repository.getReferenceById(id);
    }

    public Appointment save(Appointment appointment) {
        return repository.save(appointment);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
