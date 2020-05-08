
public class SimpleGeometricObject {
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Construct a default geometric objects
	public SimpleGeometricObject() {
		dateCreated=new java.util.Date();
	}
	
	//Construct a geometric objects with specified color and filled value
	public SimpleGeometricObject(String color,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	// return color
	public String getColor() {
		return color;
	}
	//set a new Color
	public void setColor(String color) {
		this.color=color;
	}
	// returned filled
	public boolean isFilled() {
		return filled;
	}
	
	// set a new filled
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	
	// get date created
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public String toString() {
		return "created on "+dateCreated+"\ncolor "+color+" and filled "+filled;
	}
	
}
