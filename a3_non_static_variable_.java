/*
 * 2.) NON STATIC VRIABLE :-
 *    
 * ~> belongs to object
 * ~> also known as instance variable
 * ~> not mandatory to initialized
 * ~> variable are store in object
 * ~> static & non static variable name can't be same
*/
public class non_static_variable {
	int x = 10;
	
	public void test(){ //non static method
		System.out.println("from test method");
	}
	public static void main(String[] args) {
		non_static_variable a1 = new non_static_variable();
		System.out.println(a1.x); //10
		
		a1.test(); //call test method
	}
}
