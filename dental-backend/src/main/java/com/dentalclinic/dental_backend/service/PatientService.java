package com.dentalclinic.dental_backend.service;

import com.dentalclinic.dental_backend.entity.Patient;
import com.dentalclinic.dental_backend.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public List<Patient> getAll() {
        return repository.findAll();
    }

    public Patient getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Patient save(Patient patient) {
        return repository.save(patient);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
