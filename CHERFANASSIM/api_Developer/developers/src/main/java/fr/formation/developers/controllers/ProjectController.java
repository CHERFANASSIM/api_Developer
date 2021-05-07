package fr.formation.developers.controllers;

import java.time.LocalDate;
import java.util.*;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Project;
import fr.formation.developers.domain.ProjectClosed;
import fr.formation.developers.domain.Team;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	
	List<Project> listProjects = new ArrayList<Project>();
	
	List<ProjectClosed> listProjectsClosed = new ArrayList<ProjectClosed>();

	public ProjectController() {
		super();
		Project project1 = new Project("Spring Boot", "description: spring boot", LocalDate.now(), 344.00 );
		listProjects.add(project1);
		
	}
	
	
	
	@GetMapping
	List<Project> getList() {
		
		for( Project p : listProjects) {
			System.out.println(p);
		}
		
		return listProjects;
	}
	
	
	@PostMapping("/add")
	public Project addToList(@RequestBody Project project) {
		listProjects.add(project);
		System.out.println(project + " a été rajouté");
		return project;
	}
	
	
	
	@PatchMapping("/{name}/patch")
	public void updatePartialProject( @PathVariable String name, @RequestBody Project project) {
		
	
		for ( Project pr: listProjects) {
			if(pr.getName().equals(name)) {
				pr.setBudgetAnnual(project.getBudgetAnnual());
				pr.setDescrption(project.getDescrption());
				System.out.println(pr + " a été modifié");
				
			}
		}	
		
	}
	@DeleteMapping("/{name}/closed")
	public void closedByNameProject (@PathVariable String name) {
		int index = -1;
		ProjectClosed projectClosed = new ProjectClosed();
		
		Project projectDeleted = new Project();
		
		for(Project project : listProjects) {
			if(project.getName().equals(name)) {
		//	index = listTeams.indexOf(team);
				
			projectClosed.setName(project.getName());	
			projectClosed.setDescrption(project.getDescrption());
			projectClosed.setStartDate(project.getStartDate());
			projectClosed.setDateClosed(LocalDate.now());
			
			projectDeleted = project;
			
			}
		}
		
		listProjects.remove(projectDeleted);
		
		listProjectsClosed.add(projectClosed);
		
		for(Project project : listProjects) {
			System.out.println("The projects :");
		System.out.println(project);
		}	
		for(ProjectClosed projectsClosed : listProjectsClosed) {
			System.out.println("The projects closed :");
		System.out.println(projectsClosed);
		}
		///System.out.println(project + " a été rajouté");
		// return project;
	}
	

}
