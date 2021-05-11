package fr.formation.developers.validation;

import java.time.LocalDate;
import java.time.Period;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AdultValidator implements ConstraintValidator<Adult, LocalDate> {

	@Override
	public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
		
		LocalDate now = LocalDate.now();
		Period period = Period.between(value, now);
		 //LocalDate.now() - value
		
		int age = period.getYears();
		return  age >= 18? true : false; 
			
		
	}

}
