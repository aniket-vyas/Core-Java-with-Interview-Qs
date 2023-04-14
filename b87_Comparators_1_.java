/*
 *			COMPARATORS IN JAVA :-
 *
 * ~> a comparator interface is used to order the abjects of user defined classes
 * ~> a comparator object is capable of comparing 2 object of the same class
 * ~> if in sorting , obj1 comes first then obj2 then it will return -ve value , but obj2 comes first
 * 		then obj1 then it will return +ve value. If both the obj are same then it will return 0
*/
public class A {
	
	int id;
	
	String name;
	
	A(int id , String name){  // constructor 
		this.id = id;
		this.name = name;
	}
	
}
