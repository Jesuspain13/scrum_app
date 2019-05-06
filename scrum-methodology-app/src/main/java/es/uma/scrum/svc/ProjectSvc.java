package es.uma.scrum.svc;

import java.util.List;

import org.springframework.stereotype.Service;

import es.uma.scrum.models.Project;

public interface ProjectSvc {
	
	public List<Project> getProjects();
}
