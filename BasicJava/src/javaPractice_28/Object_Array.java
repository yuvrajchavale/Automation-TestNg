package javaPractice_28;

import java.util.Arrays;

public class Object_Array {

	public static void main(String[] args) {
		Object [] arr = {10.4,"Mine",'Q',8803030l,10.05,11,22};
		System.out.println(Arrays.toString(arr));


		for (Object object : arr) {

			System.out.println(object);

		}
		
		Multi_Obj_Array();
	}


	static void Multi_Obj_Array() {
		Object [][] arr2 = {
				{"Name" , "Yuvraj"},
				{"Company" , "Capgemini"},
				{"Position" , "Analyst"},
				{"Location", "Pune"},
				{"Salary", 400000},
				{"Pincode", 51211}
		};

		for (int i = 0; i < arr2.length; i++) {
			
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			} 
			System.out.println();
		}
		
	}

}
