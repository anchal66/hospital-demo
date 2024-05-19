package com.mohit.hospitalmagement.service;

import com.mohit.hospitalmagement.dto.DoctorRequest;
import com.mohit.hospitalmagement.dto.DoctorResponse;

public interface DoctorService {
    DoctorResponse addDoctor(DoctorRequest doctorRequest);
    void removeDoctor(Long id);
}
