package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.developers.domain.Project;

public class NameDescriptionValidator 
implements ConstraintValidator<NameDescriptionEqualValidation, Project> {

	@Override
	public boolean isValid(Project value, ConstraintValidatorContext context) {
	  //  boolean myvar = value.getName().equals(value.getDescrption());
		return !value.getName().equals(value.getDescrption());
	}

}
