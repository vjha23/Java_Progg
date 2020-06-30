// find the index of array element
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		int index=0;
		int[] arr= {1,3,5,6,5};
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the element that you want to search");
		int value=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(value==arr[i])
			{
				index=i;
				break;
			}
		}
		
		System.out.println("Index value for this element is "+ index);
		
		
}
}
