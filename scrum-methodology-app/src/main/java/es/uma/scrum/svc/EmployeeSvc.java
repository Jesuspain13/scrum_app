package es.uma.scrum.svc;

import java.util.List;

import es.uma.scrum.models.Employee;

public interface EmployeeSvc {

	/**
	 * Get employee list from DB (setting null Project Attributes that invoke recursion
	 * @return
	 */
	public List<Employee> getEmployees();
}
