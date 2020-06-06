// Binary Search Program
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list= {2,4,7,10,11,45,50,59,60,66,69,70,79};
		int i=BinarySearch(list,2);
		int j=BinarySearch(list,7);
		int k=BinarySearch(list,10);
		int l=BinarySearch(list,45);
		int m=BinarySearch(list,69);
		System.out.print("element=2 "+i);
		System.out.print("element=7 "+j);
		System.out.print("element=10 "+k);
		System.out.print("element=45 "+l);
		System.out.print("element=69 "+m);
	}

	public static int BinarySearch(int[] list, int key) {
		// TODO Auto-generated method stub
		int low=0;
		int  high=list.length-1;
		
		while(high>=low) {
			int mid=(low+high)/2;
			if(key<list[mid])
				high=mid-1;
			else if(key==list[mid])
				return mid;
			else
				low=mid+1;
		}
		return -low-1; // now high< low,key not found
	}

}
