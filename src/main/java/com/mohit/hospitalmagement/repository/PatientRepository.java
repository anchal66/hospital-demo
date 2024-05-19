package com.mohit.hospitalmagement.repository;

import com.mohit.hospitalmagement.enity.Doctor;
import com.mohit.hospitalmagement.enity.Patient;
import com.mohit.hospitalmagement.enums.City;
import com.mohit.hospitalmagement.enums.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
