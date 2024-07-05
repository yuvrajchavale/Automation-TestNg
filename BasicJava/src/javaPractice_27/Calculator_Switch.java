package javaPractice_27;

import java.util.Scanner;

public class Calculator_Switch {

	public static void main(String[] args) {
		Scanner M = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {

			System.out.println("Enter the Num1" );
			int Num1 = M.nextInt();

			System.out.println("Enter the Num2" );
			int Num2 = M.nextInt();

			int result;
			System.out.println("Select the Opertion +,-,*,/");

			String Operation = M.next();

			switch (Operation) {
			case "+":
				result = Num1 + Num2;
				System.out.println(result);
				break;

			case "-":
				result = Num1 - Num2;
				System.out.println(result);
				break;

			case "*":
				result = Num1 * Num2;
				System.out.println(result);
				break;

			case "/":
				try
				{
					result = Num1 / Num2;
					System.out.println(result);
				}
				catch (ArithmeticException e)
				{
					e.printStackTrace();
				    System.out.println("Please enter Rather than 0/0 ");
				}
				break;

			default:
				System.out.println("Wrong Operation Chosen");
				break;
			}

		}

	}

}
