package com.mohit.hospitalmagement.controller;

import com.mohit.hospitalmagement.dto.SuggestionResponse;
import com.mohit.hospitalmagement.service.SuggestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
