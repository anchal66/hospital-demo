package com.mohit.hospitalmagement.service;

import com.mohit.hospitalmagement.dto.SuggestionResponse;

public interface SuggestionService {
    SuggestionResponse suggestDoctor(Long patientId);
}
