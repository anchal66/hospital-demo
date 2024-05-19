package com.mohit.hospitalmagement.controller;

import com.mohit.hospitalmagement.dto.DoctorRequest;
import com.mohit.hospitalmagement.dto.DoctorResponse;
import com.mohit.hospitalmagement.dto.PatientRequest;
import com.mohit.hospitalmagement.dto.PatientResponse;
import com.mohit.hospitalmagement.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/patient")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<PatientResponse> addDoctor(@RequestBody PatientRequest patientRequest){
        return ResponseEntity.ok(patientService.addPatient(patientRequest));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id){
        patientService.removePatient(id);
        return ResponseEntity.noContent().build();
    }
}
