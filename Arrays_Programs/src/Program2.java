// java prog to test if an array contain a specific value
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr= {20,30,56,45,76};
		boolean found=false;
		System.out.println("Enter the element that you wamt to search");
		int value=scan.nextInt();
		for(int i:arr)
		{
			if(value==i)
			{
				found=true;
				break;
			}
		
		}
		if(found)
		System.out.println("Element is Found "+value);
		else
			System.out.println("Elemenet is  not found");
	}

}
