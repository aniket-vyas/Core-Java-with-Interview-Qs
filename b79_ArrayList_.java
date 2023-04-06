/*
 *		ARRAYLIST :-
 *
 * ~> it is made inside internal memory
 * ~> default size is 10
 * ~> but dynamic in nature
 * ~> it will store value as an object inside
 * ~> after fill 10 elements comp. it will increase the size 1.5 times
 * ~> it maintain insertion order
 * ~> it can consist of duplicate elements
 * ~> adv : reading of data would give us best performance
 * ~> disadv : insertion of data in b/w of the arraylist will result in poor performance
*/

import java.util.ArrayList;
import java.util.Iterator;
public class A {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(20);
		x.add(10); //duplicate element
		x.add(40);
		x.add(new Integer(50)); //other way to write
		
		System.out.println("add method() : " + x); //[10,20,10,40,50]
		
		System.out.println("size : " + x.size()); // 5
		
		x.add(1,500);
		System.out.println("add(index , value) method() : " + x); //[10,500,20,10,40,50]
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(300);
		y.add(400);
		
		x.addAll(2,y);
		System.out.println("addAll(index , collection) method() : " + x);
		//[10, 500, 300, 400, 20, 10, 40, 50]
		
		if(x.contains(500)) {
			System.out.println("yes present");
		} else {
			System.out.println("not present");
		}
		
		x.remove(1);
		System.out.println("remove(index) method() : " + x); 
		//[10, 300, 400, 20, 10, 40, 50]
		
		System.out.println("get(index) value : " + x.get(1)); // 300
		
		Iterator<Integer> itr = x.iterator();
		while(itr.hasNext()) {
			System.out.println("value of x : " + itr.next());
		}
		//		value of x : 10
		//		value of x : 300
		//		value of x : 400
		//		value of x : 20
		//		value of x : 10
		//		value of x : 40
		//		value of x : 50
	}
}
