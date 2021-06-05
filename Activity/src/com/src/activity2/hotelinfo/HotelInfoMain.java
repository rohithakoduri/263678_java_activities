package com.src.activity2.hotelinfo;

import java.util.Scanner;

public class HotelInfoMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Hotel Traff Calculator\n1.Deluxe Room\n2.Deluxe AC Room\n3.Suite AC Room\nSelect Room Type");
		int value=sc.nextInt();
		DeluxeRoom dr=new DeluxeRoom();
		DeluxeACRoom drc=new DeluxeACRoom();
		SuiteACRoom sr=new SuiteACRoom();
		Scanner sc1=new Scanner(System.in);
		sc1.close();
		if(value==1) {
			System.out.println("Hotel Name");
			dr.setHotelName(sc1.nextLine());
			System.out.println("Room Square Feet Area");
			dr.setNumberOfSqFeet(sc.nextInt());
			System.out.println("Room has TV (yes/no)");
			dr.setHasTV(sc.nextBoolean());
			System.out.println("Room has WIFI (yes/no)");
			dr.setHasWifi(sc.nextBoolean());
			System.out.println("Room Tariff per day is:"+dr.getRatePerSqFeet()*dr.getNumberOfSqFeet());
			
		}
		else if(value==2) {
			System.out.println("Hotel Name");
			drc.setHotelName(sc1.nextLine());
			System.out.println("Room Square Feet Area");
			drc.setNumberOfSqFeet(sc.nextInt());
			System.out.println("Room has TV (yes/no)");
			drc.setHasTV(sc.nextBoolean());
			System.out.println("Room has WIFI (yes/no)");
			drc.setHasWifi(sc.nextBoolean());
			System.out.println("Room Tariff per day is:"+drc.getRatePerSqFeet()*drc.getNumberOfSqFeet());
			
		}
		else if(value==3) {
			System.out.println("Hotel Name");
			sr.setHotelName(sc1.nextLine());
			System.out.println("Room Square Feet Area");
			sr.setNumberOfSqFeet(sc.nextInt());
			System.out.println("Room has TV (yes/no)");
			sr.setHasTV(sc.nextBoolean());
			System.out.println("Room has WIFI (yes/no)");
			sr.setHasWifi(sc.nextBoolean());
			System.out.println("Room Tariff per day is:"+sr.getRatePerSqFeet()*sr.getNumberOfSqFeet());
			
		}
	}
}
