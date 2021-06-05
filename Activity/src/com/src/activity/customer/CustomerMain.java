package com.src.activity.customer;

import java.util.Scanner;

import com.src.activity.employee.Employee;

public class CustomerMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Enter the details:");
		String split=sc.nextLine();
		//String split="Ravi,Pune,9998887771";
		String[] arr=split.split(",");
	
		Employee emp=new Employee(arr[0],arr[1],arr[2]);
		System.out.println("Name:"+emp.getName()+"\nAddress:"+emp.getAddress()+"\nMobile:"+emp.getMobile());
	}
}
