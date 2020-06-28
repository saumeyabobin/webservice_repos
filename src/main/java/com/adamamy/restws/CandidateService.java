package com.adamamy.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.adamamy.restws.entities.Candidates;

//@Consumes("application/json")
//@Produces("application/json")
//@Path("/api/candidateService")
public interface CandidateService {
	
	//@Path("/candidates")
	//@GET
	List<Candidates> getcandidates();
	
	//@Path("/candidates/{id}")
	//@GET
	Candidates getCandidate(@PathParam("id") int id);
	
	//@Path("/candidates")
	//@POST
	Response createCandidate(Candidates candidate);
	
	//@Path("/candidates")
	//@PUT
	Response updateCandidate(Candidates candidate);

}
