import java.util.Scanner;

public class AssignGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of student");
		int n=in.nextInt();
		int[] score=new int[n];
		char[] grade=new char[score.length];
		
		// promth the user to enter the marks
		for(int i=0;i<score.length;i++) {
			System.out.println("Enter the marks");
			score[i]=in.nextInt();
		}
		
		getGrades(score,grade);
		display(score,grade);
		
	}
	public static void display(int[] score, char[] grade) {
		// TODO Auto-generated method stub
		for(int i=0;i<score.length;i++) {
			System.out.println("Student "+i+"score is "+score[i]+" and grade is "+grade[i]);
		}
	}
	public static int max(int[] score) {
		int max=0;
		for(int i=0;i<score.length;i++) {
			if(score[max]<score[i])
				max=score[i];
		}
		return max;
	}

	public static void getGrades(int[] score, char[] grade) {
		// TODO Auto-generated method stub
		int best=max(score);
		for(int i=0;i<score.length;i++) {
			if(score[i]>=best-10)
				grade[i]='A';
			else if(score[i]>=best-20)
				grade[i]='B';
			else if(score[i]>=best-30)
				grade[i]='C';
			else if(score[i]>=best-40)
				grade[i]='D';
			else
				grade[i]='F';
		}
	}
}