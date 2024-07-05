package javaPractice_29;

import java.util.ArrayList;

public class Array_ListPr {

	public static void main(String[] args) {
		ArrayList<Object> basket = new ArrayList<Object>();
		
		basket.add("Mango");
		basket.add("Excel Soap");
		basket.add("Nirma");
		basket.add("Dairy Milk");
		basket.add("Lentis");
		basket.add("Milk");
		basket.add("Paneer");
		
		System.out.println(basket.size());
		
		System.out.println("-----------");
		
		System.out.println(basket.get(2));
		
		System.out.println("-----------");
		for (int i = 0; i < basket.size(); i++) {
			
			System.out.println(basket.get(i));
			
		}
		
		System.out.println("-----------");
		
		for (Object object : basket) {
			
			System.out.println(object);
			
		}
		
		System.out.println("-----------");
		
		for (int i = 0; i <=2 ; i++) {
			
			System.out.println(basket.get(i));
			
		}

	}

}
