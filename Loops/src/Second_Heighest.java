import java.util.Scanner;

// program to find the high score and second heighest score
public class Second_Heighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of students ");
		int no_student=in.nextInt();
		String name="";
		int marks=0;
		int high_score=0;
		String high_name="";
		int sec_score=0;
		String sec_name="";
		int student=1;
		for(int i=1;i<=no_student;i++) {
			System.out.println("Enter the name of student ");
			name=in.next();
			System.out.println("Enter the marks of student ");
			marks=in.nextInt();
			if(marks>high_score) {
				sec_score=high_score;
				sec_name=high_name;
				high_name=name;
				high_score=marks;
			}
			else if(marks>sec_score) {
				sec_score=marks;
				sec_name=name;
			}
			
		}
		System.out.println("Heighest scorer name           "+high_name+" marks:             "+high_score);
		System.out.println("Second Heighest scorer name            "+sec_name+" second highest marks:             "+sec_score);
	}

}
