package fr.formation.developers.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ TYPE, FIELD })
@Constraint(validatedBy = { NameDescriptionValidator.class })

public @interface NameDescriptionEqualValidation {
	String message() default "le nom ne doit pas etre égale à description";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
