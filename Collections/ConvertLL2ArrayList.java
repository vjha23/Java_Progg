import java.util.*;
public class ConvertLL2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>linkedlist=new LinkedList<String>();
		linkedlist.add("Harry");
		linkedlist.add("Jack");
		linkedlist.add("Tim");
		linkedlist.add("Rick");
		linkedlist.add("Rock");
		
		List<String> list=new ArrayList<String>(linkedlist);
		for(String str:list) {
			System.out.println(str);
		}
	}

}
