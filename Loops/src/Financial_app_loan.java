import java.util.Scanner;
/*
 *  (Financial application: compare loans with various interest rates) Write a program that lets the user enter the loan amount
 *   and loan period in number of years and displays the monthly and total payments for each interest rate starting from 5% to 8%, 
 *   with an increment of 1/8. Here is a sample run:
 */
public class Financial_app_loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of loan");
		double loan=in.nextDouble();
		System.out.println("Enter the time period");
		int year=in.nextInt();
		// Display header table
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		
	
		
	}

}
