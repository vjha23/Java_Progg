//copy an array into another array
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,44,6,78,65};
		int[] arr2=new int[6];
		int i;
		for(i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("In array1: ");
		
		for(i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+",");
		}
		System.out.println("In array2: ");
		for(i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+",");
		}
	}

}
