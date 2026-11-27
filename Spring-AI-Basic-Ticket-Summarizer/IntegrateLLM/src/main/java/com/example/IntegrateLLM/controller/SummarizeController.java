package com.example.IntegrateLLM.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IntegrateLLM.Service.SummaryService;

@RestController
@RequestMapping("/api")
public class SummarizeController {

    private SummaryService summaryService;

    public SummarizeController(SummaryService summaryService){
        this.summaryService = summaryService;
    }

    @PostMapping("/summarize")
    public ResponseEntity<String> summarizeText(@RequestBody String ticket) {
        return ResponseEntity.ok(summaryService.summarize(ticket));
    }
}