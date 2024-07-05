package javaPractice_27;

import java.util.Scanner;

public class Scanner_Else {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			int marks =M.nextInt();
			if (marks > 35) 
			{
				System.out.println("Pass");
			}else 
			{System.out.println("Fail");}
		
		}

	}

}
