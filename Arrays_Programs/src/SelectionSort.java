// Selection Sort Program
public class SelectionSort {

	public static void SelectionSort(double[] list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.length-1;i++) {
			double currentMin=list[i];
			int currentMinIndex=i;
			for(int j=i+1;j<list.length;j++) {
				if(currentMin>list[j]) {
					currentMin=list[j];
					currentMinIndex=j;
				}
			}
			if(currentMinIndex!=i) {
				list[currentMinIndex]=list[i];
				list[i]=currentMin;
			}
		}
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		double list[]= {4,5,2,4,9.9,4.4};
		SelectionSort.SelectionSort(list);
	}

}
