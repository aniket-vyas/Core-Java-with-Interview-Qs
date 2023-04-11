/*
 *			TREE SET :-
 *
 * ~> this class can contain unique elements
 * ~> it does not allow null element
 * ~> it sorts the data in ascending order
*/

import java.util.TreeSet;
public class Tree_Set {
	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(100);
		tree.add(20);
		tree.add(40);
		tree.add(40);
		tree.add(30);
		tree.add(10);
		// tree.add(null);  --> null pointer exception
		
		System.out.println(tree);  // [10, 20, 30, 40, 100]
	}
}
