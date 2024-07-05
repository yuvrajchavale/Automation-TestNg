package javaPractice_29;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> car = new ArrayList<String> ();
		car.add("Defender");
		car.add("Safari");
		car.add("Toyota Hilux");
		car.add("Fortuner");
		car.add("Innova Crysta");
		car.add("Tata Harrier");
		System.out.println(car.size());
		System.out.println(car.get(3));
		
		for (int i = 0; i <= 3; i++) {
			System.out.println(car.get(i));
		}
		
		System.out.println("==========================");
		
		for (String string : car) {
			
			System.out.println(string);
			
		}
		
		System.out.println("==========================");
		
		for (int i = 0; i < car.size(); i++) {
			
			System.out.println(car.get(i));
		}
		
	}

}
