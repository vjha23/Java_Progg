import java.util.Scanner;

// SentinelValue program
public class SentinelValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer the input ends if it is 0");
		int data=in.nextInt();
		int sum=0;
		while(data!=0) {
			sum+=data;
			System.out.println("Enter the integer the input ends if it is 0");
			data=in.nextInt();
		}
		System.out.println("The sum is "+sum);
	}

}
