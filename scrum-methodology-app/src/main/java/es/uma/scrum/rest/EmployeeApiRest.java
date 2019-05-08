package es.uma.scrum.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.uma.scrum.models.Employee;
import es.uma.scrum.svc.EmployeeSvc;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EmployeeApiRest {
	
	@Autowired
	private EmployeeSvc service;
	
	@GetMapping("/employees")
	public ResponseEntity<?> getEmployees() {
		try {
			List<Employee> employeesFound = service.getEmployees();
			Map<String, Object> goodResponse = new HashMap();
			goodResponse.put("employees", employeesFound);
			return new ResponseEntity<Map<String, Object>>(goodResponse, HttpStatus.OK);
		} catch (DataAccessException ex) {
			Map<String, Object> badResponse = new HashMap();
			badResponse.put("message", ex.getMostSpecificCause().getMessage());
			return new ResponseEntity<Map<String, Object>>(badResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
