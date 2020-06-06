import java.util.Scanner;

// program to count positive numbers and compute the average of number
public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum=0;
		double avg=0;
		int count_positive=0;
		int count_negative=0;
		
		int count=0;
		
		System.out.println("Enter the number");
		int data=in.nextInt();
		while(data!=0) {
			sum+=data;
			data=in.nextInt();
			if(data<0) {
				count_negative++;
			}
			else {
				count_positive++;
			}
			count++;
		
			
		}
		avg=sum/count;
		System.out.println("no of positives "+count_positive);
		System.out.println("no of negative "+count_negative);
		System.out.println("Total "+sum);
		System.out.println("Average "+avg);
	}

}
