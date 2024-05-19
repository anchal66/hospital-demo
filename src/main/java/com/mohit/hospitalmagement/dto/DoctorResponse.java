package com.mohit.hospitalmagement.dto;

import com.mohit.hospitalmagement.enums.City;
import com.mohit.hospitalmagement.enums.Speciality;
import lombok.Data;

@Data
public class DoctorResponse {
    private Long id;
    private String name;
    private City city;
    private String email;
    private String phoneNumber;
    private Speciality speciality;
}
