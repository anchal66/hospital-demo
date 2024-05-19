package com.mohit.hospitalmagement.dto;

import com.mohit.hospitalmagement.enums.City;
import com.mohit.hospitalmagement.enums.Symptom;
import lombok.Data;

@Data
public class PatientResponse {
    private Long id;
    private String name;
    private String city;
    private String email;
    private String phoneNumber;
    private Symptom symptom;
}
