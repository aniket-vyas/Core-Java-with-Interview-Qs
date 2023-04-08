/*
 *		HASH TABLE :-
 *
 * ~> it is an unordered collection of key value pair , with a unique key for each value
 * ~> data is stored in an array of list format
 * 
 * 		HASHING :-
 * 
 * ~> it is a technique where we representing any entity in the form of integer & 
 * 		it is done in java using hashCode()
 * ~> hashCode() is a method() present inside object class in java
*/
public class A {
	public static void main(String[] args) {
		
		String x = "Mia";
		System.out.println(x.hashCode()); // 77349
		
		/*
		 * => 77349 / 11(length of an array) 
		 * => remainder = 8
		 * 		8 is an index no of an array where the value of x get will store
		 * 
		 * ~> particular @ index if we can try to store more than 1 value then COLLISION happen
		 * 			
		 * 			COLLISION :-
		 * 
		 * ~> when 2 values are being store at the same index no its called collision
		 * ~> to solve the problem in hashtable we stored the data as a list maped with
		 * 		the same index no
		 * ~> SOLUTION : of COLLISION is to create a list 
		 */
	}
}
