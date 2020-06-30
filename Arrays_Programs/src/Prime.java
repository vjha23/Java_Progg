import java.util.Scanner;

// program to check prime numbers
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no  to check");
		n=in.nextInt();
		prime(n);
		
	}
public static void prime(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
		count++;	
		}
	}
	if(count==2) {
		System.out.println("Prime no");
	}
	else {
		System.out.println("Its is not a prime no");
	}
}
}
