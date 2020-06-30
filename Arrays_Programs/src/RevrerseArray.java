import java.util.Scanner;

//(Reverse the numbers entered) Write a program that reads ten integers and displays them in the reverse of the order in which they were read
public class RevrerseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr=new int[10];
		System.out.println("Enter the no");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		// Displaying the array in reverse order
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+"  ");
		}
	}

}
