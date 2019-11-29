package javaLearning;

public class StringEqualsMain {
	
	public static void main(String[] args) {
		StringEquals SE = new StringEquals();
		StringEquals SE1 = new StringEquals();
		SE.stringComparision();
		
		System.out.println(SE.s1.equals(SE.s2));
		System.out.println(SE.s1.equals(SE1.s1));
		System.out.println(SE.s1==SE.s2);
		System.out.println(SE.s1==SE1.s1);
		
		/// object reference changes in string pool when we override string, so string 
		// equals is preferred than the '=='
		SE.s1=SE.s1+"1";
		SE1.s1=SE1.s1+"1";
		System.out.println(SE.s1);
		System.out.println(SE1.s1);
		System.out.println(SE.s1.equals(SE1.s1));
		System.out.println(SE.s1==SE1.s1);
	}

}
