
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,5,7,9,4,4};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]==arr[j]&&i!=j)
				{
					System.out.println("Here duplicate element"+ arr[i]);
				}
			}
		}
	}

}
