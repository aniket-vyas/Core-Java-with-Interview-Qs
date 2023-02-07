/*
 * ~> here we inherit the members of parent class
 * 		to child class with the intension of reusing it. 
 * 
 * ~> Java does not support multiple inheritance because :-
 * 		-> developer confuse
 * 		-> design of project complex
 * 		-> diamond problem
*/
public class inheritance_2 extends inheritance_1 {
	public static void main(String[] args) {
    
    //we create object for calling non-static members
    //present in class(inheritance_1)
		inheritance_2 a1 = new inheritance_2();
		
		//it will print the value of x
		// present in class(inheritance_1)
		System.out.println(a1.x);
		
		//it will call test() present in 
		// class(inheritance_1)
		a1.test();
	}
}
