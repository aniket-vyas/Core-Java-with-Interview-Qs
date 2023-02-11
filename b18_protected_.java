/*
 * 3.) protected :-
 * 		-methods & variables :
 * 			it will work in same class , same package
 * 			& in different package only when
 * 			inheritance is done
 * 		-constructor :
 * 			if you make constructor protected then
 * 			it's object can be created in same class
 * 			& same package but not outside package
 * 		-class :
 * 			a class can't be protected
*/
public class protected_ {
	
	//protected variable
	protected int x = 10;
	
	//protected method
	protected void test() {
		System.out.println("from test method");
	}
	
	//constructor
	protected protected_() {
		System.out.println("from constructor");
	}
	
	//calling
	public static void main(String[] args) {
		protected_ a1 = new protected_();
		a1.test();
		System.out.println(a1.x);
	}
}
