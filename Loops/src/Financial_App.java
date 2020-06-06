// computer future tution
public class Financial_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int current_fees=10000;
		int increase=500;
		for(year=1;year<=10;year++) {
			current_fees+=increase;
			if(year==4) {
				System.out.println("Current fees from now  4 year is "+current_fees);
			}
		}
	}

}
