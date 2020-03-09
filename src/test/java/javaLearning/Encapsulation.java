package javaLearning;

public class Encapsulation {

	private int iInt=3;
	private String sString="Sukumar";
	
	public int getiInt() {	
		return iInt;
	}
	public String getsString() {	
		return sString;
	}
	public int setiInt(int input) {	
		iInt=input;
		return iInt;
	}
	public String setsString(String input) {	
		sString=input;
		return sString;
	}
}
