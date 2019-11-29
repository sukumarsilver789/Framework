package javaLearning;

import java.util.StringTokenizer;

public class WordCount {
	
	static int OUT=0;
	static int IN=1;
	public static void main(String[] args) {
		
		String str1="Hello this is java program for word count";
		WordCount wc = new WordCount();
		System.out.println(wc.wordCount(str1));
	}
	
	public int wordCount(String sInput) {
		
		int Count=0;
		int state=OUT;
		
		//int sOut=0;
		
		for(int i=0; i<sInput.length();i++) {
			if(sInput.charAt(i) == ' ' || sInput.charAt(i) == '\t' || sInput.charAt(i) == '\n') {
				state=OUT;				 
			}
			else if(state==OUT) {
				state =IN;
				++Count;
			}
		}
		
		// Using String tokenizer
		
		StringTokenizer stk = new StringTokenizer(sInput);
		System.out.println(stk.countTokens());
		
		/////////////////////////
		return Count;
	}

}
