/*
 *		HASH SET :-
 *
 * ~> it uses hashtable internally
 * ~> it uses hashing to inject the data into database
 * ~> it will contain only unique elements
 * ~> doesnot maintain insertion order
 * ~> this class permits the null elements
 * ~> this implementation is not synchronized
 * ~> initial size of the hashtable is 16 , when the load ratio becomes 75% that
 * 		is out of 16 , 12 elements are enjected into the table then size of the
 * 		table automatically doubles (16 * 2 = 32)
*/

import java.util.HashSet;
public class A {
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(40);
		hashSet.add(50);
		hashSet.add(50);
		hashSet.add(null);
		
		System.out.println(hashSet);  // [null , 50 , 20 , 40 , 30]
    
	}
}
