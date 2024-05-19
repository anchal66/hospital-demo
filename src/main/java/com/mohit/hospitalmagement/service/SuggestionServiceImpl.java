package com.mohit.hospitalmagement.service;

import com.mohit.hospitalmagement.dto.DoctorRequest;
import com.mohit.hospitalmagement.dto.DoctorResponse;
import com.mohit.hospitalmagement.dto.SuggestionResponse;
import com.mohit.hospitalmagement.enity.Doctor;
import com.mohit.hospitalmagement.enity.Patient;
import com.mohit.hospitalmagement.enums.City;
import com.mohit.hospitalmagement.enums.Speciality;
import com.mohit.hospitalmagement.enums.Symptom;
import com.mohit.hospitalmagement.repository.DoctorRepository;
import com.mohit.hospitalmagement.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SuggestionServiceImpl implements SuggestionService {
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    @Override
    public SuggestionResponse suggestDoctor(Long patientId) {
        Patient patient = patientRepository.findById(patientId)
                .orElseThrow(() ->
                        new IllegalArgumentException("Invalid patient id"));
        String city = patient.getCity();
        Symptom symptom = patient.getSymptom();
        Speciality speciality = getSpeciality(symptom);
        if (!List.of(City.DELHI, City.NOIDA, City.FARIDABAD)
                .contains(City.valueOf(city.toUpperCase()))){
            throw new IllegalArgumentException
                    ("We are still waiting to expend to your location :(");
        }
        List<DoctorResponse> doctorResponses = doctorRepository.findByCityAndSpeciality
                        (City.valueOf(city.toUpperCase()), speciality)
                .stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
        if (doctorResponses.isEmpty()){
            throw new IllegalArgumentException("There isn't any doctor present at yoour location for your symptom");
        }
        SuggestionResponse response = new SuggestionResponse();
        response.setDoctors(doctorResponses);
        return response;
    }

    private DoctorResponse convertToResponse(Doctor res) {
        DoctorResponse response = new DoctorResponse();
        BeanUtils.copyProperties(res, response);
        return response;
    }

    private Speciality getSpeciality(Symptom symptom) {
        switch (symptom){
            case ARTHRITIS:
            case BACK_PAIN:
            case TISSUE_INJURIES:
                return Speciality.ORTHOPEDIC;
            case DYSMENORRHEA:
                return Speciality.GYNECOLOGY;
            case SKIN_INFECTION:
            case SKIN_BURN:
                return Speciality.DERMATOLOGY;
            case EAR_PAIN:
                return Speciality.ENT;
            default:
                throw new IllegalArgumentException("Invalid data");
        }
    }
}
