package javaPractice_27;
import java.util.Scanner;

public class Hacker_Rank {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	for (int i = 0; i < 5; i++) {
		
	
	int n = scanner.nextInt();
	
	if (n % 2!=0) {
		System.out.println("Weiredo");
		
	} else { if(n >=2 && n <=5) {
		System.out.println("Not Weired1");

	}else if(n >= 6 && n <= 20) {
		System.out.println("Weired2");
	}else {
		System.out.println("Not Weired3");
	}
	}
	}
scanner.close();
	}
	

}
