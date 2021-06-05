package com.src.activity2.hotelinfo;

public class SuiteACRoom extends HotelRoom{

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
	}

	public SuiteACRoom() {
		// TODO Auto-generated constructor stub
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	protected int ratePerSqFeet =15;
	public int getRatePerSqFeet() {
		if(hasWifi) {
			return ratePerSqFeet + 2;
	}
		else {
		
		return ratePerSqFeet;
		}
		}	

}
