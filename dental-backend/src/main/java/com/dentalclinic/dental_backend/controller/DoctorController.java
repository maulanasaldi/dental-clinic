package com.dentalclinic.dental_backend.controller;

import com.dentalclinic.dental_backend.entity.Doctor;
import com.dentalclinic.dental_backend.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "http://localhost:3000")
public class DoctorController {
    private final DoctorService service;

    public DoctorController(DoctorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Doctor> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Doctor getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Doctor create(@RequestBody Doctor doctor) {
        return service.save(doctor);
    }

    @PutMapping("/{id}")
    public Doctor update(@PathVariable Long id, @RequestBody Doctor doctor) {
        Doctor existing = service.getById(id);
        if (existing != null) {
            existing.setName(doctor.getName());
            existing.setSpecialization(doctor.getSpecialization());
            existing.setPhone(doctor.getPhone());
            return service.save(existing);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
