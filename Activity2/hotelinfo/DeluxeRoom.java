package com.src.activity2.hotelinfo;

public class DeluxeRoom extends HotelRoom {
	

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
	}
	public DeluxeRoom() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected int ratePerSqFeet=10;
	public int getRatePerSqFeet() {
		if(hasWifi) {
			return ratePerSqFeet + 2;
	}
		else {
		
		return ratePerSqFeet;
		}
		}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	
	
}
