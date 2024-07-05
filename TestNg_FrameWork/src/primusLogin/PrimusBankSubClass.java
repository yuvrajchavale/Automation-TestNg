package primusLogin;

public class PrimusBankSubClass extends PrimusBaseClass {
public static void add() 
{
	int a = 123;
	int b = 456;
	int c = a + b;
	System.out.println(c);
}
public static void main(String[] args) 
{
	PrimusBaseClass.login("Admin", "Admin");
	PrimusBaseClass.closeApp();
	PrimusBankSubClass.add();
}
}
