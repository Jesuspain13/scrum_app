package es.uma.scrum.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmployee;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "actual_project_id")
	private Project actualProject;
	
	public Long getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(Long idEmployee) {
		this.idEmployee = idEmployee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Project getActualProject() {
		return actualProject;
	}
	public void setActualProject(Project actualProject) {
		this.actualProject = actualProject;
	}
	
	/**
	 * Iterate employee list and set actual project attribute null
	 * @param employees that will be change
	 */
	public static void setActualTeamNull(List<Employee> employees) {
		for (Employee e: employees) {
			e.setActualProject(null);
		}
	}
	
}
