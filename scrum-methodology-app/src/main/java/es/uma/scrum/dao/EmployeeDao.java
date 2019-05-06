package es.uma.scrum.dao;

import org.springframework.data.repository.CrudRepository;

import es.uma.scrum.models.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long> {

}
