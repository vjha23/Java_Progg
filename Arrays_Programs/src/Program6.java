import java.util.Scanner;

// find the max and min of the array
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr= {20,3,1,5,74};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				System.out.print("maximum element "+ max);
			}
			if(min>arr[i])
			{
				min=arr[i];
			    System.out.print("minimum element "+ min);	
			}
		}
	}

}
