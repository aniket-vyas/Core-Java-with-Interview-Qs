/*
 * 4.) public :-
 * 		-method & variable :
 * 			it will work in same class , same package
 * 			& different package as well
 * 		-constructor :
 * 			if you make constructor public then it's
 * 			object can be created in same class , 
 * 			same package & different package
 * 		-class :
 * 			it can be used in same package &
 * 			outside package as well
*/
public class public_ {
	
	//public variable
	public int x = 10;
	
	//public method
	public void test() {
		System.out.println("from test method");
	}
	
	//public constructor
	public public_() {
		System.out.println("from constructor");
	}
	
	//calling
	public static void main(String[] args) {
		public_ a1 = new public_();
		a1.test();
		System.out.println(a1.x);
	}
}
