package fr.formation.developers.domain.dtos;

import java.time.LocalDate;

public class DeveloperView {
	private String pseudo;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;

	public DeveloperView() {

	}

	public DeveloperView(String pseudo, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.pseudo = pseudo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "DeveloperView [pseudo=" + pseudo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", birthDate=" + birthDate + "]";
	}

}
