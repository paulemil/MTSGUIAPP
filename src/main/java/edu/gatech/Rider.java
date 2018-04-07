package edu.gatech;

public class Rider {


private Long riderId;
private String startingPoint;
private String destination;
private Boolean currentlyBoarded;
private Long vehicleId;
public Long getRiderId() {
	return riderId;
}
public void setRiderId(Long riderId) {
	this.riderId = riderId;
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
public Boolean getCurrentlyBoarded() {
	return currentlyBoarded;
}
public void setCurrentlyBoarded(Boolean currentlyBoarded) {
	this.currentlyBoarded = currentlyBoarded;
}
public Long getVehicleId() {
	return vehicleId;
}
public void setVehicleId(Long vehicleId) {
	this.vehicleId = vehicleId;
}

}
