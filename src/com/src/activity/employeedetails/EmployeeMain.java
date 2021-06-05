package com.src.activity.employeedetails;

import java.util.Scanner;

import com.src.activity.employee.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e=new Employee();
	Scanner sc=new Scanner(System.in);	
	sc.close();
	System.out.println("Enter name");
	e.setName(sc.nextLine());
	System.out.println("Enter address");
	e.setAddress(sc.nextLine());
	System.out.println("Enter mobile");
	e.setMobile(sc.nextLine());
	System.out.println("Employee Details\nName:"+e.getName()+"\nAddress:"+e.getAddress()+"\nMobile:"+e.getMobile());
	System.out.println("\nMenu:\n1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
	int value=sc.nextInt();
	getValue(value,e);
	System.out.println("\nMenu:\n1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
	int value1=sc.nextInt();
	getValue(value1,e);
	
	}
	public static void getValue(int value,Employee e) {
		Scanner sc1=new Scanner(System.in);
		sc1.close();
		if(value==1) {
			
			System.out.println("Current name is "+ e.getName());
			System.out.println("Enter name ");
			e.setName(sc1.nextLine());
			
		}
		else if(value==2) {
			System.out.println("Current address is "+ e.getAddress()+"\nEnter address");
			e.setAddress(sc1.nextLine());
			
		}
		else if(value==3) {
			System.out.println("Current mobile is "+ e.getMobile()+"\nEnter mobile");
			e.setMobile(sc1.nextLine());
			
		}
		else if(value==4) {
			System.out.println("The details are:\nName:"+e.getName()+"\nAddress:"+e.getAddress()+"\nMobile:"+e.getMobile());
			
			
		}
	}
}
