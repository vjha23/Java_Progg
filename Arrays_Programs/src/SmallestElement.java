import java.util.Scanner;

//Write a test program that prompts the user to enter ten numbers, invokes this method to return the minimum value, and displays the minimum value
public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Smallest element in array is "+smallestElement(arr));
	}

	public static int smallestElement(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			
		}
	return min;
	}

}
