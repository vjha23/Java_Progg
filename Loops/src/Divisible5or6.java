// program to check no divisble 5 or 6
public class Divisible5or6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=100;i<=1000;i++) {
			if(i%5==0&&i%6!=0) {
				System.out.println("Div by 5  "+i);
			}
			else if(i%6==0||i%5==0) {
				System.out.println("Div by 6  "+i);
			}
		}
	}

}
