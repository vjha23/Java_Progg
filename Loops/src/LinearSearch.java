// Linear Search Program
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list= {1,4,5,6,-3,10,11};
		int i=linearSearch(list,6);
		int j=linearSearch(list,10);
		int k=linearSearch(list,-3);
		System.out.println("element=6  "+i);
		System.out.println("element=10  "+j);
		System.out.println("element=-3  "+k);
		
	}

	public static int linearSearch(int[] list, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.length;i++) {
			if(key==list[i])
				return i+1;
		}
		return -1;
	}

}
