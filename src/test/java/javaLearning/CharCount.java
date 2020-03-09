package javaLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CharCount cc = new CharCount();
		CharCount.charCount("I am an Indian");
	}

	
	public  static void charCount(String sInput) {
		
		HashMap<Character, Integer> hs= new HashMap<Character, Integer>();
		for(int i=0;i<sInput.length();i++) {
			if(!hs.containsKey(sInput.charAt(i))) {
				hs.put(sInput.charAt(i), 1);
			}else
			{
				hs.put(sInput.charAt(i), hs.get(sInput.charAt(i))+1);
			}			
		}
		
		Set MapSet =  hs.entrySet();		
		Iterator it = MapSet.iterator();		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry)it.next();			
			System.out.println("Key:"+me.getKey()+" , value:"+me.getValue());

		}		
		System.out.println(hs);
	}
}
