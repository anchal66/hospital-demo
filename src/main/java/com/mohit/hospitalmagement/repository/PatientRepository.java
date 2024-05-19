package com.mohit.hospitalmagement.repository;

import com.mohit.hospitalmagement.enity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
