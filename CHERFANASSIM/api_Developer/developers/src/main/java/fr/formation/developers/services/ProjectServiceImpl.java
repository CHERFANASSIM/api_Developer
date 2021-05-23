package fr.formation.developers.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.Project;
import fr.formation.developers.domain.dtos.ProjectClosed;

@Service
public class ProjectServiceImpl implements ProjectService {

	List<Project> listProjects = new ArrayList<Project>();
	List<ProjectClosed> listProjectsClosed = new ArrayList<ProjectClosed>();

	public ProjectServiceImpl() {
		super();
		Project project1 = new Project("Spring Boot", "description: spring boot", LocalDate.now(), 344.00);
		listProjects.add(project1);
	}

	@Override
	public List<Project> getList() {

		for (Project p : listProjects) {
			System.out.println(p);
		}

		return listProjects;
	}

	@Override
	public Project addToList(Project project) {
		listProjects.add(project);
		System.out.println(project + " a été rajouté");

		return project;
	}

	@Override
	public void updatePartialProject(String name, Project project) {
		for (Project pr : listProjects) {
			if (pr.getName().equals(name)) {
				pr.setBudgetAnnual(project.getBudgetAnnual());
				pr.setDescrption(project.getDescrption());
				System.out.println(pr + " a été modifié");

			}
		}

	}

	@Override
	public void closedByNameProject(String name) {

		ProjectClosed projectClosed = new ProjectClosed();

		Project projectDeleted = new Project();

		for (Project project : listProjects) {
			if (project.getName().equals(name)) {

				projectClosed.setName(project.getName());
				projectClosed.setDescrption(project.getDescrption());
				projectClosed.setStartDate(project.getStartDate());
				projectClosed.setDateClosed(LocalDate.now());

				projectDeleted = project;
			}

		}

		listProjects.remove(projectDeleted);

		listProjectsClosed.add(projectClosed);

		for (Project project : listProjects) {
			System.out.println("The projects :");
			System.out.println(project);
		}
		for (ProjectClosed projectsClosed : listProjectsClosed) {
			System.out.println("The projects closed :");
			System.out.println(projectsClosed);
		}
		/// System.out.println(project + " a été rajouté");
		// return project;
	}

}
