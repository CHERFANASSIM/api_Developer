package fr.formation.developers.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.services.SkillService;

@RestController
public class SkillController {

	// @Autowired // @Inject dans JEE
	private final SkillService service;//

	public SkillController(SkillService service) {
		this.service = service;
	}

	@GetMapping("/skills/{id}")
	public SkillView getById(@PathVariable("id") Long id) {
		// service=nul

		return service.getById(id);
	}

	@GetMapping("/skills/{name}/by-name")
	public SkillView getByName(@PathVariable("name") String name) {

		return service.getByName(name);
	}

	@PostMapping("/skills")
	public SkillCreate create(@Valid @RequestBody SkillCreate dto) {
		System.out.println("hoho je suis la dans le controleur");
		return service.create(dto);
		//

	}

}
