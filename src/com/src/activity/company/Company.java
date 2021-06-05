package com.src.activity.company;

public class Company {
	private String name;
	 private String employees;
	 private String teamLead;
	 
	 public Company() {
		 
	 }
	 public Company(String name,String employees,String teamLead) {
		 this.name=name;
		 this.employees=employees;
		 this.teamLead=teamLead;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getTeamLead() {
		return teamLead;
	}

	public void setTeamLead(String teamLead) {
		this.teamLead = teamLead;
	}
	 
}
