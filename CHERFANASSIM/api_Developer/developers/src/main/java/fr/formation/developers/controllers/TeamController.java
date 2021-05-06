package fr.formation.developers.controllers;

import java.util.*;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Team;

@RestController
@RequestMapping("/teams")
public class TeamController {
	
	
	List<Team> listTeams = new ArrayList<Team>();
	
	
	public TeamController() {
		listTeams.add(new Team("Spring", false));
		listTeams.add(new Team("Java", true));
	}
	



	
	@GetMapping("/list")
	public List<Team> get() {
		
		for(Team team : listTeams) {
		System.out.println(team);
		return listTeams;
	}
		
		
		return listTeams;
		
	}
	
	
	@PostMapping("/add")
	public void create(@Valid @RequestBody  Team team) {
		
		listTeams.add(team);
		System.out.println(team);
	}
	
	
	
	
	
	@DeleteMapping("/{name}/delete")
	public void deleteTeamByName(@Valid @PathVariable String name) {
		int index = -1;
		Team teamDeleted = new Team();
		
		for(Team team : listTeams) {
			if(team.getName().equals(name)) {
		//	index = listTeams.indexOf(team);
			teamDeleted = team;
			}
		}
		
		// listTeams.remove(index);	
		
	   listTeams.remove(teamDeleted);
		
		System.out.println(teamDeleted + " a été suprimmé");
	}
	
	
	
	

}
