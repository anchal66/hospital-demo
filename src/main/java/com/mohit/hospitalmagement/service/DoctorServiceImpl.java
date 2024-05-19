package com.mohit.hospitalmagement.service;

import com.mohit.hospitalmagement.dto.DoctorRequest;
import com.mohit.hospitalmagement.dto.DoctorResponse;
import com.mohit.hospitalmagement.enity.Doctor;
import com.mohit.hospitalmagement.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public DoctorResponse addDoctor(DoctorRequest doctorRequest) {
        Doctor doctor = new Doctor();
        BeanUtils.copyProperties(doctorRequest, doctor);
        doctor = doctorRepository.save(doctor);
        return convertToResponse(doctor);
    }

    @Override
    public void removeDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    private DoctorResponse convertToResponse(Doctor doctor) {
        DoctorResponse response = new DoctorResponse();
        BeanUtils.copyProperties(doctor, response);
        return response;
    }
}
