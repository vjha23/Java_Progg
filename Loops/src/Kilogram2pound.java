// conversion of kilogram to pound
public class Kilogram2pound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kilogram to pound conversion");
		double pound;
		double pound_conver=2.2;
		double kilogram_conver=.453;
		double kilogram;
		System.out.println("kilogram"+"  "+"pound");
		for(kilogram=1;kilogram<=199;kilogram++) {
			pound=kilogram*pound_conver;
			System.out.println(kilogram+"  "+pound);
		}
}
