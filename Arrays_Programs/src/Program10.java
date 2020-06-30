import java.util.Arrays;

// find the second shortest element and in an array
public class Program10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,3,5,6,56,34};
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		// now sorting the array in the ascending order
		Arrays.sort(arr);
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.print("second shortest element is " + arr[1]);
	}

}
