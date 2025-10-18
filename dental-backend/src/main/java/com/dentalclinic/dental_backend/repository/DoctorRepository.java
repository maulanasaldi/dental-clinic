package com.dentalclinic.dental_backend.repository;

import com.dentalclinic.dental_backend.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
