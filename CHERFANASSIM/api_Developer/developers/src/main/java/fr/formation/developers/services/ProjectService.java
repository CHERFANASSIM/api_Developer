package fr.formation.developers.services;

import java.util.List;

import fr.formation.developers.domain.dtos.Project;

public interface ProjectService {

	List<Project> getList();

	public Project addToList(Project project);

	public void updatePartialProject(String name, Project project);

	public void closedByNameProject(String name);

}
