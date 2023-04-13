/*
 *			HASH TABLE :-
 *
 * ~> synchronized
 * ~> slow
 * ~> it store the data as a key value pair
 * ~> does not allow any null key or value
*/

import java.util.Hashtable;
public class Hash_Table_ {
	public static void main(String[] args) {
		
		Hashtable<Integer , String> hashT = new Hashtable<>();
	
		hashT.put(100 , "Mike");
		hashT.put(101 , "Ross");
		hashT.put(102 , "Saam");
		hashT.put(103 , "Ravi");
		
		System.out.println(hashT);  // {103=Ravi, 102=Saam, 101=Ross, 100=Mike}
	}
}
