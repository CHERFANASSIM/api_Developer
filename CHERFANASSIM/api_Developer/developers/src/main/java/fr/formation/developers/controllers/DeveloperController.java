package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.DeveloperCreate;
import fr.formation.developers.domain.dtos.DeveloperUpdate;
import fr.formation.developers.domain.dtos.DeveloperView;
import fr.formation.developers.services.DeveloperService;

@RequestMapping("/developers")
@RestController
public class DeveloperController {

	private final DeveloperService service;

	public DeveloperController(DeveloperService service) {
		this.service = service;
	}

	@GetMapping("/{pseudo}")
	public DeveloperView getByPseudo(@PathVariable("pseudo") String pseudo) {

//		Developer developer = new Developer();
//		developer.setPseudo(pseudo);
//		developer.setFirstName("Nassim");
//		developer.setLastName("CHERFA");
//		LocalDate date = LocalDate.of(1974, 12, 26);
//		developer.setBirthDate(date);

		return service.getByPseudo(pseudo);
	}

	@PostMapping
	public void create(@Valid @RequestBody DeveloperCreate developer) {
		// System.out.println(developer);
		service.create(developer);
	}

	@PatchMapping("/{pseudo}/birth.date")
	public void updateBirrthdate(@PathVariable("pseudo") String pseudo, @RequestBody DeveloperCreate partiel) {
		System.out.println("partiel " + partiel);
		DeveloperCreate developer = new DeveloperCreate();
		developer.setPseudo(pseudo);
		developer.setFirstName("frank");
		developer.setFirstName("marshall");
		developer.setBirthDate(partiel.getBirthDate());
		System.out.println("New objecte " + developer);
	}

	@PatchMapping("/{pseudo}/birth-date")
	public void updateBirthDate(@PathVariable("pseudo") String pseudo, @Valid @RequestBody DeveloperUpdate partial) {
		// System.out.println("Partial object=" + partial);
		// DeveloperCreate developer = new DeveloperCreate();
		// developer.setPseudo(pseudo); // Variable de chemin
		// developer.setFirstName(partial.getFirstName()); // Anomalie
		// developer.setLastName("MARSHALL");
		// developer.setBirthDate(partial.getBirthDate()); // JSON
		/////// System.out.println("Update birth date of: " + pseudo + " with new date :
		// " + partial.getBirthDate());
		service.updateBirthDate(pseudo, partial);
	}

}
