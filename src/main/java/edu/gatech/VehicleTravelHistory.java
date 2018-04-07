package edu.gatech;

import java.sql.Date;

public class VehicleTravelHistory {


private Long vehicleTravelHistoryId;
private String startingPoint;
private String destination;
private int hourOfTheDay;
private Date travelDate;
public Long getVehicleTravelHistoryId() {
	return vehicleTravelHistoryId;
}
public void setVehicleTravelHistoryId(Long vehicleTravelHistoryId) {
	this.vehicleTravelHistoryId = vehicleTravelHistoryId;
}
public String getStartingPoint() {
	return startingPoint;
}
public void setStartingPoint(String startingPoint) {
	this.startingPoint = startingPoint;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getHourOfTheDay() {
	return hourOfTheDay;
}
public void setHourOfTheDay(int hourOfTheDay) {
	this.hourOfTheDay = hourOfTheDay;
}
public Date getTravelDate() {
	return travelDate;
}
public void setTravelDate(Date travelDate) {
	this.travelDate = travelDate;
}

}
