package fr.formation.developers.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD })
@Constraint(validatedBy = { AdultValidator.class })

public @interface Adult {
	
	String message() default "l'age doit etre superieur à 18 ans";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };


}
