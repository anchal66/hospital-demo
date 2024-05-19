package com.mohit.hospitalmagement.dto;

import com.mohit.hospitalmagement.enums.Symptom;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PatientRequest {
    @NotEmpty
    @Size(min = 3)
    private String name;
    @NotEmpty
    private String city;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Pattern(regexp = "\\d{10}")
    private String phoneNumber;
    private Symptom symptom;
}
