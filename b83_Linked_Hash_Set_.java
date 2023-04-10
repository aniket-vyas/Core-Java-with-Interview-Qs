/*
 *		LINKED HASH SET :-
 *
 * ~> this class represents he LinkedList implementation of set interface
 * ~> it maintain insertion order
 * ~> it can take null value
 * ~> it can contain only unique elements
*/

import java.util.LinkedHashSet;
public class Linked_Hash_Set {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> linked = new LinkedHashSet<>();
		
		linked.add(20);
		linked.add(30);
		linked.add(40);
		linked.add(50);
		linked.add(50);
		linked.add(null);
		
		System.out.println(linked);  // [20, 30, 40, 50, null]
	}
}
