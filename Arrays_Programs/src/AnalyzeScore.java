import java.util.Scanner;
// Analyze scores) Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average and how many scores are below the average. 
//Enter a negative number to signify the end of the input. Assume that the maximum number of scores is 100
public class AnalyzeScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 int[] scores=new int[100];
		 int avg=0;
		 int sum=0;
		 int average=0;
		 int noOfScores=0;
		 System.out.println("Enter the marks of students");
		 for(int i=0;i<100;i++) {
			int num=in.nextInt();
			if(num<0)
				break;
			
			scores[i]=num;
			average +=num;
			noOfScores++;	
		 	}
		 average/=noOfScores;
		 int aboveEqual=0;
		 int below=0;
		 for(int i=0;i<noOfScores;i++) {
			 if(scores[i]>average)
				 aboveEqual++;
			 else
				 below++;
		 }
		 //  Display Results
		 System.out.println("Average Scores "+average);
		 System.out.println("above or equal scores  "+aboveEqual);
		 System.out.println("below average "+below);
}
}