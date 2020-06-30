// reverse an array of integer value
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,5,6,3,7};
		int i;
		System.out.println("original array ");
		for(i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+",");
		}
		System.out.println("reverse array ");
		for(int j=arr1.length-1;j>=0;j--)
		{
			System.out.println(arr1[j]);
		}
	}

}
