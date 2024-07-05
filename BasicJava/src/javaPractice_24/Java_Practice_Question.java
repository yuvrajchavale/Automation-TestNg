package javaPractice_24;

public class Java_Practice_Question {

	public static void main(String[] args) {
		//Length and breadth of a rectangle are 5 and 7 respectively. 
		//Write a program to calculate the area and perimeter of the rectangle.
		int x = 5 ;
		int y = 7 ;
		int Z = x * y;
		int W = 2*(x+y); 
		System.out.println("Area is " + Z + "\nPerimeter is " + W);
		triangle();
		calculation();
		equalCheck();
		power();
		assign();
		robertMarks();
		swapping();

	}
	
     static void triangle() {
    	 //Write a program to calculate the perimeter of a triangle
    	 //having sides of length 2,3 and 5 units.
    	 int a = 2;
    	 int b = 3;
    	 int c = 5;
    	 int P = a + b + c;
    	 System.out.println("Perimeter of Triangle is : " + P);
    	 
     }	
     
     static void calculation() {
    	 //Write a program to add 8 to the number 2345 and then divide it by 3.
    	 //Now, the modulus of the quotient is taken with 5 and
    	 //then multiply the resultant value by 5. Display the final result.
    	 System.out.println("Answer is : " + ((((8+2345)/3)%5) * 5) );
    	 
    	 //Now, solve the above question using assignment operators (eg. +=, -=, *=).
    	 
    	int a = 8 + 2345 ;
    	a/=3;
    	a%=5;
    	a*=5;
    	System.out.println("Final Answer : " + a);
     }
     
     static void equalCheck() {
    	 
    	int A = 23;
    	int B = 45;
    	System.out.println("Check equal or not  : " + (A==B));
    	

     }
     static void power() {
    	 System.out.println(Math.pow(7, 5));
     }
     
     static void assign() {
    	 int a = 55;
    	 int b = 70;
    	 if(a<50 && a<b) {
    		 System.out.println("Both Conditions are valid : True");
    	 }
    	 else if (a < 50 || a<b){
    		 System.out.println("Only One Condition Valid : True");
    	 }
    	 else{
    		 System.out.println("Both Conditions are not Valid");
    		 
    	 }
     }
     
     static void robertMarks() {
    	 //If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), 
    	 //write a program to calculate his total marks and percentage marks.
    	 int M = 78 ;
    	 int P = 45;
    	 int C = 62;
    	 int T = M + P + C ;
    	 int maxMarks = 300;
    	 double percentage = (T * 100.0)/maxMarks;
    	 System.out.println("Total Marks Out of 300 : " + T );
    	 System.out.println("Robert Percentage : " + percentage);
    	 
    	 
    	 
    	 
     } 
     
     static void swapping () {
    	 //Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
    	 //1 - first program by using a third variable
    	 //2 - second program without using any third variable
    	 //( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 
    	 //then after swapping the value of x and y should become 10 and 5 respectively.)
    	 int a = 6;
    	 int b = 8; 
    	 System.out.println("With Third Variable");
    	 System.out.println("Before Swapping a= " + a + ", b = " + b);
    	 // Swapping using 3rd variable
    	 int temp = a;
    	 a = b;
    	 b = temp;
    	 System.out.println("After Swapping a= " + a + ", b = " + b);
    	 
    	 int x = 6 ;
    	 int y = 8 ;
    	 System.out.println("Without Third Variable");
    	 System.out.println("Before Swapping x= " + x + ", y= " + y);
    	 x = x + y ;
    	 y = x - y ;
    	 x = x - y ; 
    	 System.out.println("After Swapping x= " + x + ", y = " + y);		
    	 
    	 
     }
}
