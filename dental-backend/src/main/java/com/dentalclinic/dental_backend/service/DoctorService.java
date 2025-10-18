package com.dentalclinic.dental_backend.service;

import com.dentalclinic.dental_backend.entity.Doctor;
import com.dentalclinic.dental_backend.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository repository;

    public DoctorService(DoctorRepository repository) {
        this.repository = repository;
    }

    public List<Doctor> getAll() { return repository.findAll(); }
    public Doctor getById(Long id) { return repository.findById(id).orElse(null); }
    public Doctor save(Doctor d) { return repository.save(d); }
    public void delete(Long id) { repository.deleteById(id); }
}
