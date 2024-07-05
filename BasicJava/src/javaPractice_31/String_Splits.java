package javaPractice_31;

import java.util.Arrays;

public class String_Splits {

	public static void main(String[] args) {
		String str  = "Java is the programming langaunge which used to Automated the Scripts";
		String str2 = "I'a am I'b am I'c am I'd am I'e am I'f am I'g am I'h am I'i am " ;
		String x[] = str2.split("am",5);
	    System.out.println(x[2]);
		
		for (String string : x) {
			
			System.out.print(string);
			
		}

	}

}
