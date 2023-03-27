/*
 *		"throw" KEYWORD :-
*/

public class A {
	public static void main(String[] args) {
    
		try {
			throw new InSufficientFunds();
		} catch (InSufficientFunds e) {
			System.out.println(e);
		}
    
	}
}
