import java.util.*;
public class LinkedList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// LL declaration
		LinkedList<String>list=new LinkedList<String>();
		list.add("item1");
		list.add("item5");
		list.add("item3");
		list.add("item6");
		list.add("item2");
		// Display Linked List Content
		System.out.println("Linked List Content "+list);
		
		// Add first and last element
		list.addFirst("First item");
		list.addLast("Last Item");
		System.out.println("Linked List Content "+list);
		
		// this is how to get and set values
		Object firstval=list.get(0);
		System.out.println("First element "+firstval);
		list.set(0, "Change first element");
		Object firstval2=list.get(0);
		System.out.println("First element after update "+firstval2);
		
		// remove first and last element
		list.removeFirst();
		list.removeLast();
		System.out.println("LL after deletion "+list);
		
		// add to a position and remove from position
		list.add(0,"Newly added item");
		list.remove(2);
		System.out.println("Final Content "+list);
	}

}
