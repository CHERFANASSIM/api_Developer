package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;

public interface DeveloperService {

	public DeveloperView getByPseudo(String pseudo);

	public void create(DeveloperCreate developer);

	public void updateBirthDate(String pseudo, DeveloperUpdate partial);

}
