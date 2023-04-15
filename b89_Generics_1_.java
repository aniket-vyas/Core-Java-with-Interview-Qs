/*
 *			GENERICS IN JAVA :-
 *
 * ~> it gives me flexibility to dynamically allocate the datatypes
*/

public class A <T> {
  
	T val;
	A(T x){  
		this.val = x;
		System.out.println(val);
	}
}
