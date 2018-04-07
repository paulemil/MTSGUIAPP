/**
 * 
 */
package edu.gatech;

/**
 * @author student
 *
 */
public class RouteSegmentGroup {

	
private Long routeSegmentGroupId;
private Long routeId;
private Long routeSegmentId;
private int orderOfSegments;
public Long getRouteSegmentGroupId() {
	return routeSegmentGroupId;
}
public void setRouteSegmentGroupId(Long routeSegmentGroupId) {
	this.routeSegmentGroupId = routeSegmentGroupId;
}
public Long getRouteId() {
	return routeId;
}
public void setRouteId(Long routeId) {
	this.routeId = routeId;
}
public Long getRouteSegmentId() {
	return routeSegmentId;
}
public void setRouteSegmentId(Long routeSegmentId) {
	this.routeSegmentId = routeSegmentId;
}
public int getOrderOfSegments() {
	return orderOfSegments;
}
public void setOrderOfSegments(int orderOfSegments) {
	this.orderOfSegments = orderOfSegments;
}


}
