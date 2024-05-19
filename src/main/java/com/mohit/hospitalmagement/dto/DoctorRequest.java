package com.mohit.hospitalmagement.dto;

import com.mohit.hospitalmagement.enums.City;
import com.mohit.hospitalmagement.enums.Speciality;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DoctorRequest {
    @NotEmpty
    @Size(min = 3)
    private String name;
    @NotEmpty
    private City city;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Pattern(regexp = "\\d{10}")
    private String phoneNumber;
    private Speciality speciality;
}
