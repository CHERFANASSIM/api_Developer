package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public class DeveloperUpdate {

	private LocalDate birthDate;

	public DeveloperUpdate() {

	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "DeveloperUpdate [birthDate=" + birthDate + "]";
	}

}
