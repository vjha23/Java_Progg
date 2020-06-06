import java.util.Scanner;

// program to create Addition Quiz
public class ReapeatAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=(int)(Math.random()*10);
		int num2=(int)(Math.random()*10);
		Scanner in = new Scanner(System.in);
		System.out.println("What is "+num1+" + "+num2+" addition?");
		int result=in.nextInt();
		
		while(result!=(num1+num2)) {
			System.out.println("Wrong answer try again ");
			result=in.nextInt();
			
		}
		System.out.println("You got it!!");
	}

}
