package com.src.activity.innings;

public class Innings {
	private String teamName;
	 private String inningsName;
	 private int runs;
	 
	 public Innings(String teamName,String inningsName,int runs) {
		 this.teamName=teamName;
		 this.inningsName=inningsName;
		 this.runs=runs;
	 }
	 
	 public void displayInningsDetails() {
			if(this.inningsName.toUpperCase().equals("FIRST")) {
			int sum=this.runs+1;
				System.out.println("Name: "+this.teamName+"\nScored: "+this.runs+"\nNeed "+sum+" to win");
			}
			else if(this.inningsName.toUpperCase().equals("SECOND")) {
			
				System.out.println("Name: "+this.teamName+"\nScored: "+this.runs+"\nMatch Ended.");
			}
		}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getInningsName() {
		return inningsName;
	}
	public void setInningsName(String inningsName) {
		this.inningsName = inningsName;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	}
