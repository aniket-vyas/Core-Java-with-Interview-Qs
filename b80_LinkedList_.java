/*
 *		LINKEDLIST :-
 *
 * ~> array is a continous block of memory
 * ~> but linkedlist is not a continous block
 * ~> we have to linked with each other
 * ~> 2 types of linkedlist
 * 		1.) Single
 * 		2.) Doubly
 * ~> in JDK , linkedlist is internaly implemented as doubly linkedlist
*/

import java.util.Iterator;
import java.util.LinkedList;
public class Linked_List {
	public static void main(String[] args) {
		LinkedList<Integer> x = new LinkedList<Integer>(); 
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(10);
		
		System.out.println("add method() : " + x); //[10,20,30,10]
		
		System.out.println("size : " + x.size()); // 4
		
		x.add(1,500);
		System.out.println("add(index , value)method() : " + x); //[10,500,20,30,10]
		
		LinkedList<Integer> y = new LinkedList<Integer>();
		y.add(300);
		y.add(500);
		
		x.addAll(2,y);
		System.out.println("addAll(index , collection)method() : " + x); 
		// [10,500,300,500,20,30,10]
		
		if(x.contains(500)) {
			System.out.println("yes present");
		} else {
			System.out.println("not present");
		}
		
		x.remove(1);
		System.out.println("remove(index) method() : " + x); // [10,300,500,20,30,10]
		
		System.out.println(x.get(1)); // 300
		
		Iterator<Integer> itr = x.iterator();
		while(itr.hasNext()) {
			System.out.println("value of x : " + itr.next());
		}
		//		value of x : 10
		//		value of x : 300
		//		value of x : 500
		//		value of x : 20
		//		value of x : 30
		//		value of x : 10
		
		// all above method are same as ArrayList
		
		// some new method of LinkedList are : 
		x.addFirst(7000);
		x.addLast(9000);
		System.out.println(x); // [7000,10,300,500,20,30,10,9000]	
	}
}
