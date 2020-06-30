// adding of two matrices of same sizes
import java.util.Scanner;
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of rows");
		m=in.nextInt();
		System.out.println("Enter the no of colomn");
		n=in.nextInt();
		
		int[][] arr1 = new int[m][n];
		int[][] arr2 = new int[m][n];
		int[][] sum = new int[m][n];
		
		// entering element in first matrix
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				arr1[i][j]=in.nextInt();
		// entering element in second matrix
				for(i=0;i<m;i++)
					for(j=0;j<n;j++)
						arr2[i][j]=in.nextInt();
	
		// for summation of matrix
			for(i=0;i<m;i++)
				for(j=0;j<n;j++)
     				sum[i][j]=arr1[i][j]+arr2[i][j];
			
		// for displaying the element
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(sum[i][j]+"\t");
				}
			}
	}

}
