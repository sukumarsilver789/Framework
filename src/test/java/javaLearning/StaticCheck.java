package javaLearning;

public class StaticCheck {

	static int i=1;
	public static void main(String [] args) {
		
		System.out.println(i);
		m();
		System.out.println(i);		
		StaticCheck sc=new StaticCheck();
		sc.m1();
		System.out.println(i);
	}
	public static void m() {		
		i+=2;
	}
	
	public void m1() {		
		i+=2;
	}
}
