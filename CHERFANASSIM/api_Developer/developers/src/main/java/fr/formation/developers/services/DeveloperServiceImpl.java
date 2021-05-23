package fr.formation.developers.services;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;

@Service
public class DeveloperServiceImpl implements DeveloperService {

	@Override
	public DeveloperView getByPseudo(String pseudo) {
		DeveloperView developer = new DeveloperView();
		developer.setPseudo(pseudo);
		developer.setFirstName("Nassim");
		developer.setLastName("CHERFA");
		LocalDate date = LocalDate.of(1974, 12, 26);
		developer.setBirthDate(date);

		return developer;
	}

	@Override
	public void create(DeveloperCreate developer) {
		System.out.println(developer);
	}

	@Override
	public void updateBirthDate(String pseudo, DeveloperUpdate partial) {
		// System.out.println("Partial object=" + partial);
		// DeveloperCreate developer = new DeveloperCreate();
		// developer.setPseudo(pseudo); // Variable de chemin
		// developer.setFirstName(partial.getFirstName()); // Anomalie
		// developer.setLastName("MARSHALL");
		// developer.setBirthDate(partial.getBirthDate()); // JSON
		System.out.println("Update birth date of: " + pseudo + " with new date : " + partial.getBirthDate());
	}

}
