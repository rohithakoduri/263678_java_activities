package com.src.activity.company;

import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args) {
		Company cp=new Company();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the company name:");
	cp.setName(sc.nextLine());
	System.out.println("Enter the employees:");
	cp.setEmployees(sc.nextLine());
	System.out.println("Enter teamLead:");
	cp.setTeamLead(sc.nextLine());
	String[] arr=cp.getEmployees().split(",");
	String isPresent=null;
	sc.close();
	for(int i=0;i<arr.length;i++) {
		if(arr[i].equals(cp.getTeamLead()))
	{
	isPresent=arr[i];
			
		}
	}
	if(isPresent!=null) {
		System.out.println("Name:"+cp.getName()+"\nEmployees:"+cp.getEmployees()+"\nTeamLead:"+cp.getTeamLead());
	}else {
		System.out.println("Invalid Input");
	}
}
}
