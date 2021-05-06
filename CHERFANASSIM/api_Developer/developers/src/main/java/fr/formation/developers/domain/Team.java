package fr.formation.developers.domain;

import javax.validation.constraints.Size;

public class Team {
	
	
	@Size(min=1,max=255)
	private String name; 
	private boolean agile;
	
	public Team() {
	}
    
	public Team(String name, boolean agile) {
		super();
		this.name = name;
		this.agile = agile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAgile() {
		return agile;
	}

	public void setAgile(boolean agile) {
		this.agile = agile;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", agile=" + agile + "]";
	}

	

	
	

}
