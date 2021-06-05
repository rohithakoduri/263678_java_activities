package com.src.activity2.vehicleinfo;

public class FourWheeler extends Vehicle {
	public FourWheeler(String make, String vehicleNumber, String fueltype, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fueltype, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	public FourWheeler() {
		super();// TODO Auto-generated constructor stub
	}
	private String audioSystem;
	private int numberOfDoors;
	public void displayDetailInfo() {
		System.out.println("the audio system:"+this.audioSystem+"number of doors:"+this.numberOfDoors);
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}
