package com.mohit.hospitalmagement.service;

import com.mohit.hospitalmagement.dto.PatientRequest;
import com.mohit.hospitalmagement.dto.PatientResponse;
import com.mohit.hospitalmagement.enity.Patient;
import com.mohit.hospitalmagement.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService{
    private final PatientRepository patientRepository;
    @Override
    public PatientResponse addPatient(PatientRequest patientRequest) {
        Patient patient = new Patient();
        BeanUtils.copyProperties(patientRequest, patient);
        patient = patientRepository.save(patient);
        return convertToResponse(patient);
    }

    @Override
    public void removePatient(Long id) {
        patientRepository.deleteById(id);
    }
    private PatientResponse convertToResponse(Patient patient) {
        PatientResponse response = new PatientResponse();
        BeanUtils.copyProperties(patient, response);
        return response;
    }
}
