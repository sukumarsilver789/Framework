package javaLearning;

public class Pyramids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramids py = new Pyramids();
		py.printPyramid(19);


	}
	
	public void printPyramid(int n) {
		
		//Half pyramid
		for(int i=0;i<n; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}	
		//Reverse half pyramid
		for(int i=n;i>0; i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//full pyramid
		
		for(int i=0;i<n; i++) {
			for(int j=1;j<=n+n-1;j++) {
				if(j>=n-i && j<=n+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}	
	}

}
