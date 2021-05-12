package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import fr.formation.developers.validation.NameDescriptionEqualValidation;
@NameDescriptionEqualValidation
public class Project {

	@Size(min = 1, max = 255)
	private String name;

	@Size(min = 100, max = 1000, message = "It must be between 100 and 1000 characters")
	private String descrption;

	@NotNull
	private LocalDate startDate;
    @Positive
	private double budgetAnnual;

	public Project() {

	}

	public Project(@Size(min = 1, max = 255) String name,
			@Size(min = 100, max = 1000, message = "It must be between 100 and 1000 characters") String descrption,
			@NotNull LocalDate startDate, double budgetAnnual) {
		super();
		this.name = name;
		this.descrption = descrption;
		this.startDate = startDate;
		this.budgetAnnual = budgetAnnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public double getBudgetAnnual() {
		return budgetAnnual;
	}

	public void setBudgetAnnual(double budgetAnnual) {
		this.budgetAnnual = budgetAnnual;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", descrption=" + descrption + ", startDate=" + startDate + ", budgetAnnual="
				+ budgetAnnual + "]";
	}

}
