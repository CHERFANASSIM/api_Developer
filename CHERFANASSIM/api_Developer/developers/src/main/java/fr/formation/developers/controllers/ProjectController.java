package fr.formation.developers.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.Project;
import fr.formation.developers.domain.dtos.ProjectClosed;
import fr.formation.developers.services.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {

	public final ProjectService service;

	List<Project> listProjects = new ArrayList<Project>();

	List<ProjectClosed> listProjectsClosed = new ArrayList<ProjectClosed>();

	public ProjectController(ProjectService service) {
		this.service = service;
//		super();
//		Project project1 = new Project("Spring Boot", "description: spring boot", LocalDate.now(), 344.00 );
//		listProjects.add(project1);

	}

	@GetMapping
	List<Project> getList() {

//		for (Project p : listProjects) {
//			System.out.println(p);
//		}
//
//		return listProjects;
		return service.getList();
	}

	@PostMapping("/add")
	public Project addToList(@Valid @RequestBody Project project) {
//		listProjects.add(project);
//		System.out.println(project + " a été rajouté");
//		return project;

		return service.addToList(project);
	}

	@PatchMapping("/{name}/patch")
	public void updatePartialProject(@PathVariable String name, @RequestBody Project project) {
//		
//	
//		for ( Project pr: listProjects) {
//			if(pr.getName().equals(name)) {
//				pr.setBudgetAnnual(project.getBudgetAnnual());
//				pr.setDescrption(project.getDescrption());
//				System.out.println(pr + " a été modifié");
//				
//			}
//		}	
		service.updatePartialProject(name, project);
	}

	@DeleteMapping("/{name}/closed")
	public void closedByNameProject(@PathVariable String name) {
//		int index = -1;
//		ProjectClosed projectClosed = new ProjectClosed();
//		
//		Project projectDeleted = new Project();
//		
//		for(Project project : listProjects) {
//			if(project.getName().equals(name)) {
//		            //	index = listTeams.indexOf(team);
//				
//			projectClosed.setName(project.getName());	
//			projectClosed.setDescrption(project.getDescrption());
//			projectClosed.setStartDate(project.getStartDate());
//			projectClosed.setDateClosed(LocalDate.now());
//			
//			projectDeleted = project;
//			
//			}
//		}
//		
//		listProjects.remove(projectDeleted);
//		
//		listProjectsClosed.add(projectClosed);
//		
//		for(Project project : listProjects) {
//			System.out.println("The projects :");
//		System.out.println(project);
//		}	
//		for(ProjectClosed projectsClosed : listProjectsClosed) {
//			System.out.println("The projects closed :");
//		System.out.println(projectsClosed);
//		}
//		      ///System.out.println(project + " a été rajouté");
//		      // return project;

		service.closedByNameProject(name);
	}

}
