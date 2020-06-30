// java program to find the number of even and odd integer in an array
public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,3,5,10,17,40,45,47,22};
		int[] even = new int[9];
		int[] odd = new int[9];
		int i;
		int c=0,d=0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+",");
			}
			else 
			{
				System.out.println(arr[i]+",");
			}
		}
	}

}

