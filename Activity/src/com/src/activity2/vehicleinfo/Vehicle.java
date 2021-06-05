package com.src.activity2.vehicleinfo;

public class Vehicle {
	protected String make;
	protected String vehicleNumber;
	protected String fueltype;
	protected int fuelCapacity;
	protected int cc;
	public Vehicle(String make,String vehicleNumber,String fueltype,int fuelCapacity,int cc) {
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fueltype=fueltype;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void displayMake() {
		System.out.println("make of vehicle"+this.make);
	}
	public void displayBasicInfo() {
		System.out.println("basic info of vehicle:\nvehicle number:"+this.vehicleNumber+"fuel type:"+this.fueltype+"fuel capacity:"+this.fuelCapacity+"cc:"+this.cc);
	}
	public void displayDetailInfo() {
		
	}
	
}
