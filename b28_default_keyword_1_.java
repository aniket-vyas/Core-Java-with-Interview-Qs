/*
 *		"default" KEYWORD :-
 *
 *  ~> version 7 of Java compelete () are not allowed
 *  	in an interface
 *  ~> "default" was introduced in version 8 of Java
 *  ~> using "default" we can develop compelete method
 *  	in an interface
*/
public interface default_1 {
	
	//compelete method in an interface
	default void test1() {
		System.out.println("from test 1");
	}
	
	//compelete method in an interface	
	default void test2() {
		System.out.println("from test 2");
	}
	
}
