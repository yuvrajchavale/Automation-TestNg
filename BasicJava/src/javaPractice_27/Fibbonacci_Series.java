package javaPractice_27;

public class Fibbonacci_Series {

	public static void main(String[] args) {
	    int a = 0;
	    int b = 1;
	    for (int i = 0; i < 10 ; i++) {
	    	int F = a + b;
	    	a = b;
	    	b = F ;
			System.out.println("Fibonacci Series : " + F);
		}

	}

}