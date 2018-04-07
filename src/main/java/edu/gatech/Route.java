/**
 * 
 */
package edu.gatech;

/**
 * @author student
 *
 */
public class Route {


private Long routeId;
private String startingPoint;
private String destination;
private String typeOfRoute;
private String direction;
public Long getRouteId() {
	return routeId;
}
public void setRouteId(Long routeId) {
	this.routeId = routeId;
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
public String getTypeOfRoute() {
	return typeOfRoute;
}
public void setTypeOfRoute(String typeOfRoute) {
	this.typeOfRoute = typeOfRoute;
}
public String getDirection() {
	return direction;
}
public void setDirection(String direction) {
	this.direction = direction;
}

}
