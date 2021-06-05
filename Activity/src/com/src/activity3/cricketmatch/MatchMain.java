package com.src.activity3.cricketmatch;

import java.util.Scanner;

public class MatchMain {
	public static void main(String[] args) {
		Match odi=new ODIMatch();
		Match t20=new T20Match();
		Match test=new TestMatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the match format\n1.ODI\n2.T20\n3.Test");
		int value=sc.nextInt();
		if(value==1) {
			System.out.println("Enter the Current score");
			odi.setCurrentscore(sc.nextInt());
			System.out.println("Enter the Current over");
			odi.setCurrentover(sc.nextInt());
			System.out.println("Enter the Target score");
			odi.setTarget(sc.nextInt());
			System.out.println("Requirements");
			odi.display(odi.calculateRunRate(), odi.calculateBalls());
			System.out.println("Required Runrate "+odi.calculateRunRate());
		}
		else if(value==2) {
			System.out.println("Enter the Current score");
			t20.setCurrentscore(sc.nextInt());
			System.out.println("Enter the Current over");
			t20.setCurrentover(sc.nextInt());
			System.out.println("Enter the Target score");
			t20.setTarget(sc.nextInt());
			System.out.println("Requirements");
			t20.display(t20.calculateRunRate(), t20.calculateBalls());
			System.out.println("Required Runrate "+t20.calculateRunRate());
		}
		else if(value==3) {
			System.out.println("Enter the Current score");
			test.setCurrentscore(sc.nextInt());
			System.out.println("Enter the Current over");
			test.setCurrentover(sc.nextInt());
			System.out.println("Enter the Target score");
			test.setTarget(sc.nextInt());
			System.out.println("Requirements");
			test.display(test.calculateRunRate(), test.calculateBalls());
			System.out.println("Required Runrate "+test.calculateRunRate());
		}
		sc.close();
	}
}
