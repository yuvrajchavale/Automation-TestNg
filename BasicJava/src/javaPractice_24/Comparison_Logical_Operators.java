package javaPractice_24;

public class Comparison_Logical_Operators {

	public static void main(String[] args) {
		int A, B, C ;
		A = 400;
		B = 400;
		C = 600;
	 // Comparison Operators
		System.out.println(A==C);
		System.out.println(A>B); // False
		System.out.println(A<B); // True
		System.out.println(A>=B);//True
		System.out.println(A!=B);
	 
	 // Logical Operators
		System.out.println(A>B && B==A); // False
		System.out.println(A>=B && B==A); // True
		System.out.println(A<=B || B>=A); // True
		System.out.println(A<=C || A>=C); // True
		System.out.println(!(A<C));
		System.out.println((A>C) != (A>C));
		
		
		

	}

}
