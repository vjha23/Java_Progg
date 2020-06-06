import java.util.Scanner;

// factorial of a intenger no
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the number");
		int number=in.nextInt();
		for(int i=1;i<number;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial "+fact);
	}

}
