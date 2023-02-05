/*
 * 		CONSTRUCTOR CHAINING :-
 * 
 * ~> whenever we call one constructor from another
 * 		constructor with respect to current object. 
 *
 * 	 )	
 * 	(
 * 	 )	--> chain like structure
 * 	(
 * 	 )
*/
public class constructor_chaining {
	constructor_chaining(){
		System.out.println("from constructor 1");
	}
	constructor_chaining(int x){
		this();
		//it will call above constructor
	}
	public static void main(String[] args) {
		constructor_chaining a1 = new constructor_chaining(100);
		//it will call above constructor
	}
}
