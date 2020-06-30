import java.util.Scanner;

// (Find the index of the smallest element) Write a method that returns the index of 
//the smallest element in an array of integers. If the number of such elements is greater than 1, return the smallest index
public class SmallestIndexElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter the elements in array ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		int index=SmallestElement(arr);
		
		System.out.println("The smallest element in array is"+arr[index]+"and the index value is "+index);
	}

	public static int SmallestElement(int[] arr) {
		// TODO Auto-generated method stub
		int min=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			index=i;}
		}
	return index;
	}

}
