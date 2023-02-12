/*
 * 1.) OVERRIDING :-
 * 		~> inheritance + modify logic of that () 
 * 		~> for override return type & ()name 
 * 			must be same
*/
public class overriding extends polymorphism {
	@Override 		//annotation
	public void test() {
		System.out.println(500);
	}
	public static void main(String[] args) {
		overriding a1 = new overriding();
		a1.test();
		//it will call above test()
		//but not call test() present in
		//class (polymorphism.java)
	}
}
