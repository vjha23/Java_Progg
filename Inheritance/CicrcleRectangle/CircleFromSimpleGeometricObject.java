
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double radius;
	public CircleFromSimpleGeometricObject() {
	}
	
	public CircleFromSimpleGeometricObject(double radius) {
		this.radius=radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius,String color,boolean filled) {
		this.radius=radius;
		setColor(color);
	}
	
	// return radius
	public double getRadius() {
		return radius;
	}
	
	// set a new radius
	public void setRadius(double radius) {
		this.radius=radius;
	}
	// return area
	public double getArea() {
		return Math.PI*radius*radius;
	}
	// return diameter
	public double getDiameter() {
		return 2*radius;
	}
	
	// return perimeter
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	// print the circle info
	public void printCircle() {
		System.out.println("the circle is created "+getDateCreated()+" and the radius is "+radius);
	}
}
