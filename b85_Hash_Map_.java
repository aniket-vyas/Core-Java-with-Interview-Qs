/*
 *			HASH MAP :-
 *
 * ~> it internally use hash table
 * ~> to inject the data into hash table , it uses hashing technique
 * ~> it store the data as a key value pair 
 * ~> it contains only unique key
 * ~> non synchronized
 * ~> fast
 * ~> allows one null key & multiple null values
*/

import java.util.HashMap;
import java.util.Map;
public class Hash_Map {
	public static void main(String[] args) {
		
		Map<Integer , String> stuID = new HashMap<>();
		
		stuID.put(100 , "Pankaj");
		stuID.put(101 , "Ravi");
		stuID.put(102 , "Saam");
		stuID.put(103 , "Mike");
		
		System.out.println(stuID);  // {100=Pankaj, 101=Ravi, 102=Saam, 103=Mike}
		
		System.out.println(stuID.get(102));  // Saam
		
		System.out.println(stuID.values());  // [Pankaj, Ravi, Saam, Mike]
		
		System.out.println(stuID.keySet());  // [100, 101, 102, 103]
	}
}
