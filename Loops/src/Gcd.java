import java.util.Scanner;

// greatest common divisor
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the number");
			int num1=in.nextInt();
			System.out.println("Enter the number");
			int num2=in.nextInt();
			int gcd=1;
			int k=2;
			while(k<=num1&&k<=num2) {
				if(num1%k==0&&num2%k==0) {
					gcd=k;
				}
				k++;
			}
			System.out.println("gcd is "+gcd);
	}

}
