/*
 * 2.) default :-
 * 		-method & variable :
 * 			it will not work outside package
 * 		-constructor :
 * 			if you make constructor default
 * 			then it's object can be created 
 * 			same class & same package but not
 * 			outside package
 * 		-class :
 * 			if you make class default then it
 * 			can be used in same class &
 * 			same package but not outside package
*/
public class default_ {
	
	//default variable
	int x = 10;
	
	//default method()
	void test() {
		System.out.println("from test()");
	}
	
	//default constructor
	default_(){
		System.out.println("from constructor");
	}
	
	public static void main(String[] args) {
		default_ a1 = new default_();
		System.out.println(a1.x);
		a1.test();
	}
}
