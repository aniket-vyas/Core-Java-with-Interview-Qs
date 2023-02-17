/*
 *		ABSTRACT CLASS :-
 *
 * ~> whenever you creating a class , inside a class
 * 		we build only compelete methods
 * 		in class --> compelete()
 * 		in interface --> incompelete()
 * ~> I want to develop comp() & incomp() in a class
 * 		what to do ?
 * 			--> use abstract class
 * ~> an abstract class can constist of both 
 * 		comp() & incomp() in it
 * ~> we can create static & non-static members both 
 * 		in abstract class
 * ~> an object of abstract class can not be created
 * ~> it does not support multiple inheritance
*/

abstract public class abstract_class {
	
	int x = 10; //non-static --> but we can not call
	
	public static void test1() {
		System.out.println("from test2()");
	}
	
	public void test2() { //non-static() --> we can not call
		System.out.println("from test1()");
	}
	
	abstract public void test3(); //non-static()
	
	public static void main(String[] args) {
		abstract_class.test1();
	}
}
