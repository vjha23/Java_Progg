
public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
	private double width;
	private double heighth;
	
	public  RectangleFromSimpleGeometricObject() {
	}

	public RectangleFromSimpleGeometricObject(double width,double heighth){
		this.width=width;
		this.heighth=heighth;
	}
	
	public RectangleFromSimpleGeometricObject(double width,double heighth,String color,boolean filled) {
		this.heighth=heighth;
		this.width=width;
		setColor(color);
		setFilled(filled);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double getHeighth() {
		return heighth;
	}
	
	public void setHeighth(double heighth) {
		this.heighth=heighth;
}
	// return area
	public double getArea() {
		return width*heighth;
	}
	
	// return perimeter
	public double  getPerimeter() {
		return 2*(width+heighth);
	}
}