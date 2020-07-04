import java.util.*;
public class ArrayList_Loop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(14);
		list.add(3);
		list.add(45);
		list.add(40);
		
		// for loop for iterating arrylist
		System.out.println("For Loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		// Advanced for loop
		System.out.println("Advanced for loop");
		for(Integer num:list) {
			System.out.println(num);
		}
		// while loop for iterating ArrayList
		System.out.println("While Loop");
		int count=0;
		while(list.size()>count) {
			System.out.println(list.get(count));
			count++;
		}
		// Looping Array list under Iterator
		System.out.println("Iterator");
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
