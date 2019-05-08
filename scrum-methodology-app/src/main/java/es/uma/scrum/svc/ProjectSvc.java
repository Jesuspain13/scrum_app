package es.uma.scrum.svc;

import java.util.List;

import org.springframework.stereotype.Service;

import es.uma.scrum.models.Project;

public interface ProjectSvc {
	
	/**
	 * Get projects from DB (setting null employee attributes that invoke recursion)
	 * @return Project list
	 */
	public List<Project> getProjects();
}
