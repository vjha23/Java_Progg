import java.util.Scanner;

//  (Print distinct numbers) Write a program that reads in ten numbers and displays distinct numbers (i.e., if a number appears multiple times,
//it is displayed only once). (Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.) 
//After the input, the array contains the distinct numbers
public class DistinctNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] distinct=new int[10];
		int num;
		int count=0;
		System.out.println("Enter the no ");
		for(int i=0;i<10;i++) {
			num=in.nextInt();
			if(isdistinct(distinct,num))
				distinct[count]=num;
			count++;
		}
		// displaying the ditinct no
		for(int i=0;i<distinct.length;i++) {
			if(distinct[i]>0)
			System.out.println(distinct[i]+"  ");
		}
	}

	public static boolean isdistinct(int[] distinct, int num) {
		// TODO Auto-generated method stub
		for(int i=0;i<distinct.length;i++) {
			if(num==distinct[i])
				return false;
		}
		return true;
	}

}
