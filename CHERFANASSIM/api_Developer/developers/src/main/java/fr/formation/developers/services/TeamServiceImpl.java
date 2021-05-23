package fr.formation.developers.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.Team;

@Service
public class TeamServiceImpl implements TeamService {

	List<Team> listTeams = new ArrayList<Team>();

	public TeamServiceImpl() {
		listTeams.add(new Team("Spring", false));
		listTeams.add(new Team("Java", true));
	}

	@Override
	public List<Team> get() {

		for (Team team : listTeams) {
			System.out.println(team);
			return listTeams;
		}

		return listTeams;

	}

	@Override
	public void create(Team team) {
		listTeams.add(team);
		System.out.println(team);

	}

	@Override
	public void deleteTeamByName(String name) {
		Team teamDeleted = new Team();
		for (Team team : listTeams) {
			if (team.getName().equals(name)) {
				teamDeleted = team;
			}

		}
		listTeams.remove(teamDeleted);

		System.out.println(teamDeleted + " a été suprimmé");
	}
}
