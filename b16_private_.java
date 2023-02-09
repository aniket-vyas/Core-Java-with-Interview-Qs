/*
 * 		ACCESS SPECIFIER / MODIFIER
 * 
 * ~> 4 types are :-
 * 		1.) private
 * 		2.) default
 * 		3.) protected
 * 		4.) public
 * 
 * 1.) private :-
 * 		-methods & variables :
 * 			it will not work outside class
 * 		-constructor :
 * 			if you make constructor private
 * 			then it's object can be created 
 * 			same class only
 * 		-classes :
 * 			a class can never be private
*/
public class private_ {
	
	private int x = 10; //variable
	
	private void test() { //method
		System.out.println("from test()");
	}
	
	private private_(){ //constructor
		System.out.println("from constructor");
	}
	
	public static void main(String[] args) {
		//calling
		private_ a1 = new private_();
		System.out.println(a1.x);
		a1.test();
	}
}
