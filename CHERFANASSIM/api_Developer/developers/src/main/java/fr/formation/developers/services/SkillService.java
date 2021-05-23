package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;

public interface SkillService {

	SkillView getById(Long id);

	public SkillView getByName(String name);

	public SkillCreate create(SkillCreate dto);

}
