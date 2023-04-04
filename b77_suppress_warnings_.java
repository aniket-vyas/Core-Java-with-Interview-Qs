/*
 *		SUPPRESS WARNINGS :-
 *
 * ~> it tells a programmer that a cast may cause a program to throw an exception
 * 		somewhere else. Suppressing the warning with @SuppressWarnings tells the
 * 		compiler that the programmer believes the code to be safe & won't cause
 * 		unexpected exception
*/

public class A {
	public static void main(String[] args) {
		
		int i = 10; 	// warning
		// - Add @SuppressWarnings 'unused' to 'i'
		// - Add @SuppressWarnings 'unused' to 'main()'
		
		@SuppressWarnings("unused")
		int j = 20; 	// no warning
		// Add @SuppressWarnings 'unused' to 'j'
		
	}
	
	@SuppressWarnings("unused")
	public void test() {
		
		int k = 30; 	// no warning
		// Add @SuppressWarnings 'unused' to 'test()'
		
	}
}
