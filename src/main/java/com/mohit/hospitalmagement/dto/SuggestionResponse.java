package com.mohit.hospitalmagement.dto;

import lombok.Data;

import java.util.List;

@Data
public class SuggestionResponse {
    private List<DoctorResponse> doctors;
}
