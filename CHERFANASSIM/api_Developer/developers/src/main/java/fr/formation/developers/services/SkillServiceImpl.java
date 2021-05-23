package fr.formation.developers.services;

import org.springframework.stereotype.Service;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;
import fr.formation.developers.domain.entities.Skill;
import fr.formation.developers.repositories.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

	private final SkillRepository reposytory;

	public SkillServiceImpl(SkillRepository reposytory) {
		this.reposytory = reposytory;
	}

	@Override
	public SkillView getById(Long id) {

		Skill skill = reposytory.findById(id).get();
		SkillView view = new SkillView();
		view.setName(skill.getName());
		return view;
	}

	@Override
	public SkillCreate create(SkillCreate dto) {
		Skill skill = new Skill();
		skill.setName(dto.getName());
		reposytory.save(skill);

		return dto;
	}

	@Override
	public SkillView getByName(String name) {
		Skill skill = reposytory.findByName(name).get();
		SkillView view = new SkillView();
		view.setName(skill.getName());
		return view;
	}
}
