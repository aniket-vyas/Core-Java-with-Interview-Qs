/*
 *		HASH CODE() :-
 *
 * ~> hashcode() is define in Java Object Class
 * ~> it is used to generate the hash values of object
*/

public class A {
	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println(a1); // A@15db9742 (obj add)
		
		System.out.println(a1.hashCode()); // 366712642 (hash value)
    
	}
}
