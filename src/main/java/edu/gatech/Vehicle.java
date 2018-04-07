/**
 * 
 */
package edu.gatech;

import java.sql.Timestamp;

/**
 * @author student
 *
 */
public class Vehicle {

	private Long id;
	private String vehicleType;
	private String vehicleNumber;
	private Boolean currentlyRunning;
	private String direction;
	private int maxCapacity;
	private int currentPassengers;
	private Timestamp startTime;
	private Timestamp endTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public Boolean getCurrentlyRunning() {
		return currentlyRunning;
	}
	public void setCurrentlyRunning(Boolean currentlyRunning) {
		this.currentlyRunning = currentlyRunning;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public int getCurrentPassengers() {
		return currentPassengers;
	}
	public void setCurrentPassengers(int currentPassengers) {
		this.currentPassengers = currentPassengers;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

}
