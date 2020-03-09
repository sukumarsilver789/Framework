package javaLearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayAndLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> LL = new LinkedList<String>();
		
		LL.add("Sukumar");
		LL.add("test1");
		LL.add("test2");
		LL.add("test3");
		LL.add(1,"insert test1");
		
		System.out.println(LL);		
		List<String> AL = new ArrayList<String>();
		
		AL.add("Sukumar");
		AL.add("test1");
		AL.add("test2");
		AL.add("test3");
		AL.add(1,"insert test1");
		
		Iterator ir = AL.iterator();		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println(AL);
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("test1");
		hs.add("test1");
		hs.add("test2");
		hs.add("test3");
//		hs.addAll("")
		
		System.out.println(hs);
		
	}

}
