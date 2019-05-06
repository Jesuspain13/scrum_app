package es.uma.scrum.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uma.scrum.dao.ProjectDao;
import es.uma.scrum.models.Project;
import es.uma.scrum.svc.ProjectSvc;

@Service
public class ProjectSvcImpl implements ProjectSvc {
	
	@Autowired
	private ProjectDao dao;

	@Override
	public List<Project> getProjects() {
		return (List<Project>) dao.findAll();
	}

}
