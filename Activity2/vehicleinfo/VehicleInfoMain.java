package com.src.activity2.vehicleinfo;

import java.util.Scanner;

public class VehicleInfoMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		TwoWheeler tw=new TwoWheeler();
		FourWheeler fw=new FourWheeler();
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter vehicle type:");
		int value=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		sc1.close();
		if(value==1) {
			System.out.println("Enter vehicle make:");
			fw.setMake(sc1.nextLine());
			System.out.println("Enter vehicle number:");
			fw.setVehicleNumber(sc1.nextLine());
			System.out.println("Enter fuel type:\n1.Petrol\n2.Diesel");
			fw.setFueltype(sc.nextInt()==1?"Petrol":"Diesel");
			System.out.println("Enter fuel capacity:");
			fw.setFuelCapacity(sc.nextInt());
			System.out.println("Enter engine cc:");
			fw.setCc(sc.nextInt());
			System.out.println("Enter audio system:");
			fw.setAudioSystem(sc1.nextLine());
			System.out.println("Enter No of doors:");
			fw.setNumberOfDoors(sc.nextInt());
			System.out.println("***"+fw.getMake()+"***\n---Basic Information---\nVehicle Number:"+fw.getVehicleNumber()+"\nFuel Capacity:"+fw.getFuelCapacity()+"\nFuel Type:"+fw.getFueltype()+"\nCc:"+fw.getCc()+"\n---Detail Information---\nAudio System:"+fw.getAudioSystem()+"\nNumber of Doors:"+fw.getNumberOfDoors());
		}
		else if(value==2) {
			System.out.println("Enter vehicle make:");
			tw.setMake(sc1.nextLine());
			System.out.println("Enter vehicle number:");
			tw.setVehicleNumber(sc1.nextLine());
			System.out.println("Enter fuel type:\n1.Petrol\n2.Diesel");
			tw.setFueltype(sc.nextInt()==1?"Petrol":"Diesel");
			System.out.println("Enter fuel capacity:");
			tw.setFuelCapacity(sc.nextInt());
			System.out.println("Enter engine cc:");
			tw.setCc(sc.nextInt());
			System.out.println("Kick Start Available(yes/no):");
			tw.setKickStartAvailable(sc1.nextBoolean());
			
			System.out.println("***"+tw.getMake()+"***\n---Basic Information---\nVehicle Number:"+tw.getVehicleNumber()+"\nFuel Capacity:"+tw.getFuelCapacity()+"\nFuel Type:"+tw.getFueltype()+"\nCc:"+tw.getCc()+"\n---Detail Information---\n");
tw.displayDetailInfo();	
		}
}
}