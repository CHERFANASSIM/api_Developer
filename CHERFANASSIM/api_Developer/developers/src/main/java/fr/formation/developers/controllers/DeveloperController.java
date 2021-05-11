package fr.formation.developers.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.developers.domain.Developer;

@RequestMapping("/developers")
@RestController
public class DeveloperController {
	
	
	
	
	    @GetMapping("/{pseudo}")
	   public Developer getByPseudo(@PathVariable("pseudo") String pseudo) {
		   
		   Developer developer = new Developer();
		   developer.setPseudo(pseudo);
		   developer.setFirstName("Nassim");
		   developer.setLastName("CHERFA");
			LocalDate date = LocalDate.of(1974, 12, 26);
		   developer.setBirthDate(date);
		   
		  return developer; 
	   }
	    
	     @PostMapping
	    public void create(@Valid @RequestBody Developer developer) {
	    	System.out.println(developer);
	    	
	    }
	
	
	@PatchMapping("/{pseudo}/birth.date")
	public void updateBirrthdate(@PathVariable("pseudo") String pseudo , @RequestBody Developer partiel) {
		System.out.println("partiel " +partiel );
		Developer developer = new Developer();
		developer.setPseudo(pseudo);
		developer.setFirstName("frank");
		developer.setFirstName("marshall");
		developer.setBirthDate(partiel.getBirthDate());
		System.out.println("New objecte " +developer);	
	}
	
	

}
