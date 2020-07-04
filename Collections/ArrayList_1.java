// Creation of Arraylist
import java.util.*;
public class ArrayList_1 {
	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("vijay");
		alist.add("mohit");
		alist.add("neha");
		alist.add("priya");
		System.out.println(alist);
		alist.add(1,"shanu");
		System.out.println(alist);
//		//set method-We can use the set method to change an element in ArrayList. We provide the index and new element
//		alist.set(2, "vishal");
//		System.out.println(alist);
//		//remove method
//		alist.remove("neha");
//		alist.remove(3);
//		System.out.println(alist);
		// Iterating over ArrayList
		for(String str:alist) {
			System.out.println(str);
		}
	}
}
