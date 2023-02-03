/*
 *		CONSTRUCTORS :-
 *
 *  ~> constructor should have same name as that of class
 *  ~> when ever we create an object, constructor is being called 
 *  ~> it can never return any value 
 *  	--> return 100; //error
 *  	--> return; //correct
 *  
 *  ~> constructor overloading :-
 *  	we create more than one constructor in same class with
 *  	different no. of arguments or different types of arguments.
*/
public class constructor {
	//1
	constructor(){ //no argument constructor
		System.out.println("from constructor");
	}
	
	//2
	constructor(int x){ //with argument
		System.out.println("from 2nd constructor x = " + x);
	}
	
	//3
	constructor(int x , String y , char z){
		System.out.println("NAME : " + y + " AGE : " + x + " SECTION : " + z);
	}
	public static void main(String[] args) {
		System.out.println("start main");
		
		//object are calling constructor based on matching arguments
		constructor a = new constructor(); //call 1st constructor
		constructor b = new constructor(20); //call 2nd constructor
		constructor c = new constructor(22 , "Aniket" , 'A'); //call 3rd constructor
		
		System.out.println("end main");
	}
}
