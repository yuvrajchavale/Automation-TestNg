package javaPractice_27;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int i = 1; i < 10; i++) {
			String Fruits = s.next();
			switch (Fruits.toUpperCase()) {
			case "PINEAPPLE":
				System.out.println("Fruit Available");
				break;
				
			case "GUAVA":
				System.out.println("Fruit Avialable");
				break;
				
			case "MANGO":
				System.out.println("Fruit Avialable");
				break;
				
			case "APPLE":
				System.out.println("Fruit Avialable");
				break;

			default:
				System.out.println("Fruit is not available yet");
				break;
			}
			
		}

	}

}
