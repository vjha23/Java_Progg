import java.util.Arrays;
import java.util.Scanner;

// (Execution time) Write a program that randomly generates an array of 100,000 integers and a key. Estimate the execution time
public class Execution_Time {
	public static void main(String[] args) {
		int[] arr=new int[100000];
		for(int i=0;i<arr.length;i++) {
			arr[i]=getRandom();
		}
		int key=getRandom();
		System.out.println("Linear Search Execution");
		long startTime=System.currentTimeMillis();
		int linearSearch=LinearSearch(arr,key);
		long endTime=System.currentTimeMillis();
		long executionTime=endTime-startTime;
		System.out.println("Execution time of invoking the linearsearch in miliseconds: "+executionTime);
		
		Arrays.sort(arr);
		System.out.println("Binary Search Execution ");
		startTime=System.currentTimeMillis();
		int BinarySearch=BinarySearch(arr,key);
		linearSearch=LinearSearch(arr,key);
	    endTime=System.currentTimeMillis();
	    executionTime=endTime-startTime;
		System.out.println("Execution time of invoking the Binary Search in miliseconds: "+executionTime);
}

	public static int BinarySearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		int low=0;
		int high=arr.length-1;
		while(high>=low) {
			int mid=(low+high)/2;
			if(key<mid)
				high=mid-1;
			else if(key==mid)
				return mid;
			else
				low=mid+1;
		}
		
		return -low-1;
	}

	public static int LinearSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i])
				return i;
		}
		return -1;
	}

	private static int getRandom() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*100000);
	}
}