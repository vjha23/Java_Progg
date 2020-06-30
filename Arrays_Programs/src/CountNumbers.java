import java.util.Scanner;
// (Count single digits) Write a program that generates 100 random integers between 0 and 9 and displays the count for each number.
//(Hint: Use (int)(Math.random() * 10) to generate a random integer between 0 and 9. Use an array of ten integers, say counts,to store the counts for the number of 0s, 1s, ..., 9s.)
public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
			System.out.println("Enter the numbers ");
			int[] counts=new int[10];
			int num;
			for(int i=0;i<10;i++) {
				counts[(int)(Math.random()*10)]++;
								
			}
			System.out.println("Count for each number 0 and 9");
			for(int i=0;i<counts.length;i++) {
				System.out.println(i+ "s: "+counts[i]);
			}
	}
}
