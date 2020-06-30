import java.util.Scanner;

// (Count occurrence of numbers) Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume
//the input ends with 0. Here is a sample run of the program:
public class OccurenceOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] counts=new int[100];
		System.out.println("enter the integer no btw 1 to 100");
		count(counts);
		for(int i=0;i<counts.length;i++) {
			if(counts[i]>0)
				System.out.println((i+1)+"occcurs "+counts[i]+"time"+(counts[i]>1?"s" : ""));
		}
	}

	public static void count(int[] counts) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num;
		do {
			num=in.nextInt();
			if(num>=1&&num<=100)
				counts[num-1]++;
		}while(num!=0);
	}

}
