package com.src.activity2.vehicleinfo;

public class TwoWheeler extends Vehicle {
public TwoWheeler(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fueltype, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
public TwoWheeler() {
	super();// TODO Auto-generated constructor stub
}
private boolean kickStartAvailable;
public void displayDetailInfo() {
	System.out.println("kick Start Available:"+this.kickStartAvailable);
}
public boolean isKickStartAvailable() {
	return kickStartAvailable;
}
public void setKickStartAvailable(boolean kickStartAvailable) {
	this.kickStartAvailable = kickStartAvailable;
}

}
