package com.mohit.hospitalmagement.service;

import com.mohit.hospitalmagement.dto.PatientRequest;
import com.mohit.hospitalmagement.dto.PatientResponse;

public interface PatientService {
    PatientResponse addPatient(PatientRequest patientRequest);
    void removePatient(Long id);
}
