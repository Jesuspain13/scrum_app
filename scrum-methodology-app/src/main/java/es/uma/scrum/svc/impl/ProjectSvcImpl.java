package es.uma.scrum.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uma.scrum.dao.ProjectDao;
import es.uma.scrum.models.Employee;
import es.uma.scrum.models.Project;
import es.uma.scrum.svc.ProjectSvc;

@Service
public class ProjectSvcImpl implements ProjectSvc {
	
	@Autowired
	private ProjectDao dao;

	@Override
	public List<Project> getProjects() {
		List<Project> queryResult = (List<Project>) dao.findAll();
		for (Project p: queryResult) {
			Employee.setActualTeamNull(p.getTeam());
		} 
		return queryResult;
	}

}
