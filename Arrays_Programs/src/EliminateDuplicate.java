import java.util.Arrays;
import java.util.Scanner;

// (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values
public class EliminateDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		duplicate_Eliminate(arr);
	}

	private static void duplicate_Eliminate(int[] arr) {
		// TODO Auto-generated method stub
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1])
				arr[j++]=arr[i];
		}
		arr[j++]=arr[arr.length-1];
		
		for(int k=0;k<j;k++) {
			System.out.print(arr[k]+",");
		}
	}
	



}
