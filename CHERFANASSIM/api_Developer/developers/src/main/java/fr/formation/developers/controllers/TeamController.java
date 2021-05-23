package fr.formation.developers.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.Team;
import fr.formation.developers.services.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {

	private final TeamService service;

//	List<Team> listTeams = new ArrayList<Team>();
//	
//	
	public TeamController(TeamService service) {
//		listTeams.add(new Team("Spring", false));
//		listTeams.add(new Team("Java", true));
		this.service = service;
	}

	@GetMapping("/list")
	public List<Team> get() {

//		for (Team team : listTeams) {
//			System.out.println(team);
//			return listTeams;
//		}
//
//		return listTeams;
		return service.get();

	}

	@PostMapping("/add")
	public void create(@Valid @RequestBody Team team) {

		// listTeams.add(team);
		// System.out.println(team);
		service.create(team);
	}

//	
//	
//	
//	
//	
	@DeleteMapping("/{name}/delete")
	public void deleteTeamByName(@Valid @PathVariable String name) {
//		int index = -1;
//		Team teamDeleted = new Team();
//		
//		for(Team team : listTeams) {
//			if(team.getName().equals(name)) {
//		//	index = listTeams.indexOf(team);
//			teamDeleted = team;
//			}
//		}
//		
//		// listTeams.remove(index);	
//		
//	   listTeams.remove(teamDeleted);
//		
//		System.out.println(teamDeleted + " a été suprimmé");
		service.deleteTeamByName(name);
	}
//	

}
