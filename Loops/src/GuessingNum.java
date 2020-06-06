import java.util.Scanner;
// program to guess the numbers
public class GuessingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=(int)(Math.random()*101);
		int correct_ans=num;
		System.out.println("Guess the number btw 0 to 100");
		int guess=-1;
		while(guess!=num) {
			System.out.println("Enter the no to guess");
			guess=in.nextInt();
			if(guess==num)
				System.out.println("You got it right,The no is "+num);
			else if(guess>num)
				System.out.println("Your guess is high make it low");
			else
				System.out.println("Your guess is pretty low make it high");
		}
	}

}
