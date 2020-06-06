import java.util.Scanner;

// factors of integers
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter the number");
		int num=in.nextInt();
		for(int i=1;i<=num;++i) {
			if(num%i==0)
				System.out.println(i+" ");
			
		}
	}

}
