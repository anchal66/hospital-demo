package com.mohit.hospitalmagement.controller;

import com.mohit.hospitalmagement.dto.DoctorRequest;
import com.mohit.hospitalmagement.dto.DoctorResponse;
import com.mohit.hospitalmagement.dto.SuggestionResponse;
import com.mohit.hospitalmagement.service.DoctorService;
import com.mohit.hospitalmagement.service.SuggestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/suggestion")
@RequiredArgsConstructor
public class SuggestionController {

    private final SuggestionService suggestionService;

    @GetMapping("/{id}")
    public ResponseEntity<SuggestionResponse> suggesstDoc(@PathVariable Long id){
        return ResponseEntity.ok(suggestionService.suggestDoctor(id));
    }
}
