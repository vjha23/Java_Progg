
public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleFromSimpleGeometricObject circle=new CircleFromSimpleGeometricObject();
		System.out.println("A circle "+circle.toString());
		System.out.println("The color is "+circle.getColor());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("the diameter "+circle.getDiameter());
		
		RectangleFromSimpleGeometricObject rect=new RectangleFromSimpleGeometricObject(2,4);
		System.out.println("A rectangle has "+rect.toString());
		System.out.println("the area of rectange is "+rect.getArea());
		System.out.println("the perimeter is "+rect.getPerimeter());
	}
	
	
	


}
