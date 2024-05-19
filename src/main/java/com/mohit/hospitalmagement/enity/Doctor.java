package com.mohit.hospitalmagement.enity;

import com.mohit.hospitalmagement.enums.City;
import com.mohit.hospitalmagement.enums.Speciality;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 3)
    private String name;
    @Enumerated(EnumType.STRING)
    @NotEmpty
    private City city;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Pattern(regexp = "\\d{10}")
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
}
