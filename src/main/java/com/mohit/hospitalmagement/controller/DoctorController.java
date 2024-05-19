package com.mohit.hospitalmagement.controller;

import com.mohit.hospitalmagement.dto.DoctorRequest;
import com.mohit.hospitalmagement.dto.DoctorResponse;
import com.mohit.hospitalmagement.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping
    public ResponseEntity<DoctorResponse> addDoctor(@RequestBody DoctorRequest doctorRequest){
        return ResponseEntity.ok(doctorService.addDoctor(doctorRequest));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Long id){
        doctorService.removeDoctor(id);
        return ResponseEntity.noContent().build();
    }
}
