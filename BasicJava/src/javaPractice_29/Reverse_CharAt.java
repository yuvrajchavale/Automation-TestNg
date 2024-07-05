package javaPractice_29;import javax.swing.plaf.basic.BasicBorders;

public class Reverse_CharAt {

	public static void main(String[] args) {

		String s = "Moye Moye";
		
		System.out.println("== Using Forloop ==");

		for (int i = s.length()-1; i>=0; i--) 
		{
           System.out.print(s.charAt(i));
		}
		
		System.out.println("\n"+"== Using Buffer Method ==");
		
		StringBuffer B = new StringBuffer(s);
		System.out.println(B.reverse());

	}

}
