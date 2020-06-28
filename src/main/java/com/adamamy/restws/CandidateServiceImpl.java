package com.adamamy.restws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adamamy.restws.entities.Candidates;
import com.adamamy.restws.entities.Product;
import com.adamamy.restws.repos.CandidatesRepository;
@Service("candidateservice")
public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	CandidatesRepository cRepo;

	@Override
	public List<Candidates> getcandidates() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}

	@Override
	public Candidates getCandidate(int id) {
		// TODO Auto-generated method stub
		return cRepo.findById(id).get();
	}

	@Override
	public Response createCandidate(Candidates candidate) {
		Candidates cand = cRepo.save(candidate);
		return Response.ok(cand).build();
	}

	@Override
	public Response updateCandidate(Candidates candidate) {
		Candidates savedCand = cRepo.save(candidate);
		return Response.ok(savedCand).build();
	}

}
