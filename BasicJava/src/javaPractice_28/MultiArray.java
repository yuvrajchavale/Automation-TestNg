package javaPractice_28;

public class MultiArray {

	public static void main(String[] args) {
		String y [] [] [] = {
				{{"Admin","A@123","21k"}
				,{"Tester","T@123","23k"}}

				,{{"Automation", "AT@123","24k"},
					{"Devloper","D@123","28k"}},

				{{"Go Lang","GL@123","35k"},
						{"Cloud","C@123","81k"}}

		};

		System.out.println(y.length);
		System.out.println(y[0].length);

		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {

				for (int j2 = 0; j2 < y[i][j].length; j2++) {
					

						System.out.print( "\t" + y[i][j][j2] + "\t");
					}

					System.out.println();
				}
				
			}

		}

	}


