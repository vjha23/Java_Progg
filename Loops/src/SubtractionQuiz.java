import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int count=0;
		int countcorrect=0;
		int NoOfQues=5;
		
		long startTime=System.currentTimeMillis();
		String output="";
		
		while(count!=NoOfQues) {
			int num1=(int)(Math.random()*10);
			int num2=(int)(Math.random()*10);
			// swapping the no if first no is greater
			if(num1<num2) {
				int temp=num1;
				num1=num2;
				num2=temp;
			}
			System.out.println("Welcome! \nWhat is "+num1+ "-"+num2+" is?");
			int answer=in.nextInt();
			if(answer==(num1-num2)) {
				System.out.println("You got it right,Nice!!");
				countcorrect++;
			}
			else {
				System.out.println("your answer is wrong,\n your answer should be " +(num1-num2));
			}
			count++;
			output+="\n"+ num1 + "-" + num2 + "="+ answer + ((num1-num2==answer)?"correct":"wrong");
	}
		long endTime=System.currentTimeMillis();
		long testTime=endTime-startTime;
		System.out.println("correct count is "+ countcorrect +"\nTest time is " + testTime/1000 +"seconds" +output);
	}
}

