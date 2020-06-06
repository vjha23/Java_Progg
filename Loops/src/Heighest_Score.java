import java.util.*;

// heighest score amongs the students(Suppose 5 student)
public class Heighest_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int student=1;
		String name;
		int marks;
		int max_marks=0;
		String max_name="";
		
		String mid_name="";
		System.out.println("Enter the name of student");
		name=in.next();
		System.out.println("Enter the marks");
		marks=in.nextInt();
		int mid_marks=0;
		for(int i=1;i<=3;i++) {
			if(marks>max_marks) {
				max_name=name;
				max_marks=marks;
			}
			System.out.println("Student: "+name+ " marks "+marks);
			System.out.println("Enter the name of student");
			name=in.next();
			System.out.println("Enter the marks");
			marks=in.nextInt();
		
			
		}
		System.out.println("Maxixum marks of stduent");
		System.out.println(max_name+"  "+max_marks);
		
		System.out.println("Second Heighest marks of stduent");
		System.out.println(mid_name+"  "+mid_marks);
	}

}
