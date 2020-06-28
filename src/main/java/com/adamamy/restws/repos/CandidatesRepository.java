package com.adamamy.restws.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adamamy.restws.entities.Candidates;


public interface CandidatesRepository extends JpaRepository<Candidates, Integer> {
	
	
}
