/*
 *		OBJECT CLONING :-
 *
 * ~> it is a way to create exact copy of an object
 * ~> the process of creating the replica of particular object by coping the
 * 		content of one object into another object
 * ~> java.lang.Cloneable interface must be implemented by the class whose object
 * 		clone we want to create
 * ~> if we don't implement cloneable interface , clone() method generates 
 * 		CloneNotSupportedException
 * ~> clone() is defined in the Object class
*/
public class A implements Cloneable{
	public static void main(String[] args) {
		
		A a1 = new A();
		
		try {
			
			A a2 = (A)a1.clone();
		
			System.out.println(a1); // print a1 object add
			System.out.println(a2); // print a2 object add
			
			for(int i = 0 ; i<100 ; i++) {
				System.out.println(a2.clone()); // print 100 object add
			}
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
