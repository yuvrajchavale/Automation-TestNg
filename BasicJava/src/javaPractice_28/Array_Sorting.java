package javaPractice_28;
import java.util.Arrays ;

public class Array_Sorting {

	public static void main(String[] args) {
		int code_Id [] = {33511,25454,95844,65456,68496,56516,65615,15151};
		System.out.println(code_Id.length);
		String code_Lang [] = 
			{
					"Java",
					"Python",
					"Sql",
					".Net Framework",
					"C#",
					"Go lang",
					"Rust",
					"Java Script"
					
			};
		System.out.println(code_Lang.length);
		System.out.println(" Before Sorting \n" + Arrays.toString(code_Lang));
		System.out.println(" Before Sorting \n" + Arrays.toString(code_Id));
		Arrays.sort(code_Lang);
		System.out.println("After Sorting \n" + Arrays.toString(code_Lang));
		Arrays.sort(code_Id);
		System.out.println("After Sorting \n" + Arrays.toString(code_Id));

	}

}
