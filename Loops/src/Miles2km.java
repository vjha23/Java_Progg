// Miles to kilometer
public class Miles2km {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Miles to km conversion");
		double miles;
		double km_conver=1.609;
		double km;
		System.out.println("miles" +"  " +"km");
		for(miles=1;miles<=10;miles++) {
			km=miles*km_conver;
			System.out.println(miles +"  " +km);
	}

}
}
