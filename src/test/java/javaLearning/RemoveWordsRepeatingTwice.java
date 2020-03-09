package javaLearning;

import java.util.HashMap;
import java.util.Map;

public class RemoveWordsRepeatingTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String str = "I am Indian I am Indian I am Indian how are you" ;		
		String [] wordCount=str.split(" ");		
		Map<String,Integer> intermediate = new HashMap<String,Integer>();
		String output="";		
		for (int i=0; i<wordCount.length;i++) {			
			if(!intermediate.containsKey(wordCount[i])) {
				intermediate.put(wordCount[i], 1);
				output=output+wordCount[i]+" ";
			}else if(intermediate.containsKey(wordCount[i]) && intermediate.get(wordCount[i]) < 2) {
				intermediate.put(wordCount[i], intermediate.get(wordCount[i])+1);
				output=output+wordCount[i]+" ";
			}		
		}
		System.out.println(output);
	}
}
