package fr.formation.developers.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProjectClosed extends Project {
	
	

	private LocalDate dateClosed;

	public ProjectClosed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDate getDateClosed() {
		return dateClosed;
	}

	public void setDateClosed(LocalDate dateClosed) {
		this.dateClosed = dateClosed;
	}

	@Override
	public String toString() {
		return "ProjectClosed [dateClosed=" + dateClosed + ", getName()=" + getName() + "]";
	}
	
	
	

}
