package arrayListCol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPrac {
	
	public static void main(String[] args) {
		
		String[] subjects1 = {"Maths"};
		String[] subjects2 = {"Maths", "Science"};
		
		VectorData vd1 = new VectorData(1,"Sukumar1","a",subjects1);
		VectorData vd2 = new VectorData(2,"Sukumar2","a",subjects1);
		VectorData vd3 = new VectorData(3,"Sukumar3","a",subjects2);
		
		//vd1.getId();
		ArrayList<VectorData> AL = new ArrayList<VectorData>();
		AL.add(vd1);
		AL.add(vd2);
		
		System.out.print(vd1.getId());
		System.out.print(AL.get(0).getSection());
		
		ArrayList<Integer> AL1 = new ArrayList<>();
		AL1.add(1);
		System.out.print("\n");
		System.out.print(AL1);
		
		LinkedList ll = new LinkedList();
		ll.add("test");
		ll.add(3);
		ll.add("test2");
		ll.addFirst("test0");
		//ll.
		System.out.print(ll);
		
		ListIterator li = ll.listIterator(ll.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		System.out.println(Math.abs(100-200)+Math.abs(200-100));
	}
}
