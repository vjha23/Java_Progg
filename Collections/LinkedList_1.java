import java.util.*;
public class LinkedList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		
		//  Adding elements to the linked list
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		
		// Adding an element to the first positon
		list.addFirst("Megan");
		
		// Adding an element to the last positon
		list.addLast("Rick");
		
		// Adding an element at the third position
		list.add(2,"Glenn");
		
		// Iterating Linked List
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// Removing method of Linked List
		// remove first element
		list.removeFirst();
		// remove last element
		list.removeLast();
		// removing 2nd element 
		list.remove(1);
		for(String res:list) {
			System.out.println(res);
		}
		
	}

}
