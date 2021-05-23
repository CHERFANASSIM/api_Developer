package fr.formation.developers.services;

import java.util.List;

import fr.formation.developers.domain.dtos.Team;

public interface TeamService {

	public List<Team> get();

	public void create(Team team);

	public void deleteTeamByName(String name);

}
