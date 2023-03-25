/*
 *		finalize() :-
 *
 * ~> finalize is a method() present inside Object class
 * ~> garbage collection logic is implement in finalize()
*/
public class A extends Object{
  
	protected void finalize() {
		System.out.println(100);
	}
  
	public static void main(String[] args) {
		A a1 = new A();
		
		a1 = null;
		// it will remove the obj add & obj is applicable for garbage collection
		
		System.gc(); // it call finalize()
	}
  
}
