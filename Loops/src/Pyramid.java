import java.util.Scanner;

// pyramid program
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the height of pyramid ");
		int py_height=in.nextInt();
		int py_space=py_height-1;
		int py_star=1;
		for(int i=0;i<py_height;i++) {
			for(int j=py_space;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<py_star;k++) {
				System.out.print("*");
			}
			py_star+=2;
			System.out.println();
		}
	}

}
