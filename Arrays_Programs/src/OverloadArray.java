//(Average an array) Write two overloaded methods that return the average of an array with the following headers:
//public static int average(int[] array)
//public static double average(double[] array)
public class OverloadArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] avg= {10,26,56,78,54,87};
		double[] avg2= {3.4,6.7,8,9.4,2.5}; 
		//average(avg2);
		average(avg);
	}

	public static void average(int[] avg) {
		// TODO Auto-generated method stub
		int sum=0;
		int noOfelements=0;
		for(int i=0;i<avg.length;i++) {
			sum+=avg[i];
			noOfelements++;
		}
		int average=sum/noOfelements;
		System.out.println("Average of array is "+average);
	}
	public static void average(double[] avg) {
		// TODO Auto-generated method stub
		double sum=0;
		int noOfelements=0;
		for(int i=0;i<avg.length;i++) {
			sum+=avg[i];
			noOfelements++;
		}
		double average=sum/noOfelements;
		System.out.println("Average of array is "+average);
	}


}
