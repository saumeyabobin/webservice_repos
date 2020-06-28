package com.adamamy.restws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adamamy.restws.CandidateService;
import com.adamamy.restws.entities.Candidates;

@RestController
public class CandidateController {
	@Autowired
     private CandidateService candidateService;

    @GetMapping(value = "/api/candidates",produces = "application/json")
    public List<Candidates> getcandidates(){
        return candidateService.getcandidates();
    }

}
