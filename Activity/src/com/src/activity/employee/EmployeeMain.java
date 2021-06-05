package com.src.activity.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp=new Employee("Ravi","Pune","9998887771");
		System.out.println("Employee Details\nName:"+emp.getName()+"\nAddress:"+emp.getAddress()+"\nMobile:"+emp.getMobile());
	}
}
