package javaPractice_29;

public class Stringg_Func {

	public static void main(String[] args) {
		
		String str1 = "Yuvraj Chavale";
		String str2 = "Debrupa Chakraborty";
		String str3 = "Yuvraj Chavale";
		
		System.out.println("---For Length Method --");
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println("---For Equal Method--");
		//Both Strings are equal thats Why it's "True";
		System.out.println(str1.equals(str3));
		//Both Strings are not equal thats Why it's "False";
		System.out.println(str1.equals(str2));
		
		System.out.println("---For Equal Ignorance---");
		System.out.println(str1.equalsIgnoreCase(str3));//true
		System.out.println(str1.equals(str2));//false
		
		System.out.println("---Contains---");
		System.out.println(str1.contains("raj")); //true
		System.out.println(str1.contains(str3)); //true
		System.out.println(str1.contains("Debrupa"));//false
		
		System.out.println("---Concat---");
		System.out.println(str1.concat(str3));
		System.out.println(str1.concat(" : Qedge Student"));
		
		System.out.println("---Startswith---");
		System.out.println(str1.startsWith("Yuv"));
		System.out.println(str1.startsWith(str3));
		
		System.out.println("---endsWith---");
		System.out.println(str1.endsWith(str3));
		System.out.println(str1.endsWith("Chavale"));
		System.out.println(str1.endsWith("e"));
		System.out.println(str1.endsWith("DEbe"));// false
		
		
 
	}

}
