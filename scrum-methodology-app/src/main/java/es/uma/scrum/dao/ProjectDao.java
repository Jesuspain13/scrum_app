package es.uma.scrum.dao;

import org.springframework.data.repository.CrudRepository;

import es.uma.scrum.models.Project;

public interface ProjectDao extends CrudRepository<Project, Long> {

}
