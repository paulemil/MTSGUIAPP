package edu.gatech;

public class RouteSegment {

	private Long routeSegmentId;
	private String routeSegmentStartPoint;
	private String routeSegmentEndPoint;
	private float averageSpeed;
	private float averageVariableSpeed;
	private int hourOfTheDay;
	private String routeType;

	public Long getRouteSegmentId() {
		return routeSegmentId;
	}

	public void setRouteSegmentId(Long routeSegmentId) {
		this.routeSegmentId = routeSegmentId;
	}

	public String getRouteSegmentStartPoint() {
		return routeSegmentStartPoint;
	}

	public void setRouteSegmentStartPoint(String routeSegmentStartPoint) {
		this.routeSegmentStartPoint = routeSegmentStartPoint;
	}

	public String getRouteSegmentEndPoint() {
		return routeSegmentEndPoint;
	}

	public void setRouteSegmentEndPoint(String routeSegmentEndPoint) {
		this.routeSegmentEndPoint = routeSegmentEndPoint;
	}

	public float getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(float averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public float getAverageVariableSpeed() {
		return averageVariableSpeed;
	}

	public void setAverageVariableSpeed(float averageVariableSpeed) {
		this.averageVariableSpeed = averageVariableSpeed;
	}

	public int getHourOfTheDay() {
		return hourOfTheDay;
	}

	public void setHourOfTheDay(int hourOfTheDay) {
		this.hourOfTheDay = hourOfTheDay;
	}

	public String getRouteType() {
		return routeType;
	}

	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}

}
