package com.src.activity2.hotelinfo;

public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet; 
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		this.hotelName=hotelName;
		this.hasTV=hasTV;
		this.hasWifi=hasWifi;
		this.numberOfSqFeet=numberOfSqFeet;
	}
	
	public HotelRoom() {
		// TODO Auto-generated constructor stub
	}

	public int calculateTariff(int ratePerSqFeet) {
		//System.out.println();
		return this.numberOfSqFeet*ratePerSqFeet;
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
}
