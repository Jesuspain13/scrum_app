package es.uma.scrum.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.uma.scrum.models.Project;
import es.uma.scrum.svc.ProjectSvc;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProjectApiRest {
	
	@Autowired
	private ProjectSvc service;
	
	@GetMapping("/projects")
	public ResponseEntity<List<Project>> getProjects() {
		return new ResponseEntity<List<Project>>(service.getProjects(), HttpStatus.OK);
	}

}
