import java.util.Scanner;

// Statics mean deviation
public class Mean_Deviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr= {4,3,2,6,7};
		System.out.println("mean "+mean(arr));
		System.out.println("deviation "+deviation(arr));
		
	}

	private static double mean(int[] arr) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double mean=sum/(arr.length);
		return mean;
	}

	private static double deviation(int[] arr) {
		// TODO Auto-generated method stub
		double deviation=0;
		double mean=mean(arr);
		for(double e:arr) {
			deviation+=Math.pow(e-mean,2);
		}
		return Math.sqrt(deviation/(arr.length-1));
	}

}
