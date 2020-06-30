import java.util.Arrays;

// find the second largest element and in an array
public class Program9 {

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
		int index=arr.length-1;
		while(arr[index]==arr[arr.length-1])
		{
			index--;
		}
		System.out.print("second longest element is " + arr[index]);
	}

}
