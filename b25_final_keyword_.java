/*
 *		"final" keyword :-
 *
 * ~> if you make a variable final then its value
 * 		can not be change.
 * ~> if you make static / non-static variable final
 * 		then it is mandatory to initialize these
 * 		variables , it can not take default value
 * 		( blank field error )
 * ~> if you make method final then overriding
 * 		is not allowed
 * ~> if you make class final then inheritance
 * 		is not allowed
 * ~> every variable by default in an interface
 * 		is final & static
*/

// final public class A{ }
public class final_ {
	public static void main(String[] args) {
		
		//final variable
		final int VALUE = 10;
		System.out.println(VALUE);
		
		//call final()
		final_.test();
	}
	
	//final method()
	final public static void test() {
		System.out.println("from test()");
	}
}
