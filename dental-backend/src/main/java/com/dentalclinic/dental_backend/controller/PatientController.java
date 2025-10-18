package com.dentalclinic.dental_backend.controller;

import com.dentalclinic.dental_backend.entity.Patient;
import com.dentalclinic.dental_backend.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "http://localhost:3000") // izinkan React
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @GetMapping
    public List<Patient> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Patient create(@RequestBody Patient p) {
        return service.save(p);
    }

    @PutMapping("/{id}")
    public Patient update(@PathVariable Long id, @RequestBody Patient updatePatient) {
        Patient existing = service.getById(id);
        if (existing != null) {
            existing.setName(updatePatient.getName());
            existing.setPhone(updatePatient.getPhone());
            existing.setAddress(updatePatient.getAddress());
            return service.save(existing);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
