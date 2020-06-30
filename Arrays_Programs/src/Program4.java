import java.util.Scanner;

// remove a spefic element from an array
public class Program4 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int[] arr= {20,34,46,31,88};
			System.out.println("Enter the element that you want to remove");
			int value=scan.nextInt();
			for(int i=0;i<arr.length;i++)
			{
				if(value==arr[i])
				{
					arr[i]=arr[i+1];
				}
			}
			System.out.println("after removing");
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]+",");
			}
			
		}
}
