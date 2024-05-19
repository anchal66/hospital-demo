package com.mohit.hospitalmagement.enity;

import com.mohit.hospitalmagement.enums.City;
import com.mohit.hospitalmagement.enums.Symptom;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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
    @Enumerated(EnumType.STRING)
    private Symptom symptom;
}
