import java.util.Scanner;

// Write a test program that prompts the user to enter five numbers, invokes the method to find the gcd of these numbers, and displays the gcd.
public class ComputingGcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] num=new int[5];
		System.out.println("enter the number");
		for(int i=0;i<num.length;i++) {
			num[i]=in.nextInt();
		}
		// Display the gcd 
		System.out.println("the greatest common divisor is "+gcd(num));
	}

	private static int gcd(int[] num) {
		// TODO Auto-generated method stub
		int gcd=1;
		boolean isDivisor;
	
	}

}
