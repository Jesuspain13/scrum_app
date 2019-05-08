package es.uma.scrum.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uma.scrum.dao.EmployeeDao;
import es.uma.scrum.models.Employee;
import es.uma.scrum.svc.EmployeeSvc;

@Service
public class EmployeeSvcImpl implements EmployeeSvc {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public List<Employee> getEmployees() {
		 List<Employee> queryResult = (List<Employee>) dao.findAll();
		 for (Employee e: queryResult) {
			 // we need to set it null to avoid Exception
			 e.getActualProject().setTeam(null);
		 }
		 return queryResult;
	}

}
