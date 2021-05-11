package fr.formation.developers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UppercaseValidator implements ConstraintValidator<Uppercase, String> {
	
	

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// value doit etre en majuscule
		// si value n'est pas en majuscule alors return false
		// si value est en majuscule alors return false
		// cmparer value à sa version en majuscules (forcer)
		
		/*
		//return true;
		if (value == null) {
			return true;
		}
		*/
		String uppercased = value.toUpperCase();
		return value.equals(uppercased);
		
	    //if( value.toUpperCase().equals(value))
		//return false;
		
	}
	
	
	


}
