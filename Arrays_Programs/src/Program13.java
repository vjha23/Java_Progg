import java.util.Arrays;

// compute the average value of an array of int except largest and smallest values
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,5,7,9,4,3};
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[0];
		int sum=0;
		for(int i=1;i<arr.length;i++)
		{
			sum+=arr[i];
			if(max<arr[i])
			{
				max=arr[i];
			}
			else if(min>arr[i])
			{
				min=arr[i];
				
			}
		
		}
		int final_sum=(sum-(max-min));
		int avg=final_sum/(arr.length-2);
		System.out.print(final_sum+"=sum");
		System.out.print(avg+"=average");
		
	}

}
