package com.src.activity3.shape;

import java.util.Scanner;

public class ShapeMain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	sc.close();
	Shape sp=new Circle();
	Shape s=new Square();
	System.out.println("Circle\nSquare\nEnter the Shape");
	String value=sc.nextLine();
	
	Scanner sc1=new Scanner(System.in);
	sc1.close();
	if(value.equals("circle")) {
		System.out.println("Enter the radius");
		System.out.println("Area of circle"+sp.calculateArea(sc1.nextInt()));
	}
	
	else if(value.equals("square")) {
		System.out.println("Enter the side");
		System.out.println("Area of square"+s.calculateArea(sc1.nextInt()));
	}
}
}
