package fr.formation.developers.controllers;


import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Skill;

@RestController
public class SkillController {
	
	
	@GetMapping("/skills/{id}")
	public Skill getById(@PathVariable("id")Long id) {
		Skill skill = new Skill();
		skill.setName("spring boot" + id);
		return skill;	
	}
	
	
	
	
	@PostMapping("/skills")
	public Skill create(@Valid @RequestBody  Skill skill) {
		System.out.println(skill);
		return skill;
		
		
	}
	

}
