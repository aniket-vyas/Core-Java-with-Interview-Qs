/*
 * TYPES OF VARIABLES :-
 * 		1.) Static variable
 * 		2.) Non static variable
 * 		3.) Local variable
 * 		4.) Reference variable
 * 
 * 
 * 1.) STATIC VARIABLE :-
 *     
 * ~> belong to class
 * ~> also known as class variable
 * ~> global access : we can use anywhere in the program
 * ~> not mandatory to initialized
 * ~> it will store in common memory
 */
public class static_variable {
	static int x = 10;
	static int y = 20;
	
	public static void test() { //static method
		System.out.println("from test method");
	}
	
	public static void main(String[] args) {
		System.out.println(static_variable.x); //10
		
		static_variable.y = 25;
		System.out.println(static_variable.y); //25
		
		static_variable.test(); //it will call test method
	}
}
