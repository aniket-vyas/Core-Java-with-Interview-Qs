/*
 *		LOOPS :-
 *
 * ~> it is used to execute a particular part of the program repeatedly
 * 		if a given condition evaluates to be true.
 * ~> types :
 * 		1.) for loop
 * 		2.) while loop
 * 		3.) do-while loop
*/
public class loops {
	public static void main(String[] args) {
		
		// for loop
		System.out.println("for loop : ");
		for(int i = 0 ; i<=3 ; i++) {
			System.out.println(i);
		}
		
		// while loop
		System.out.println("while loop : ");
		int x = 0;
		while(x<3) {
			System.out.println(x);
			x++;
		}
		
		//do-while loop
		System.out.println("do-while loop : ");
		int y = 0;
		do {
			System.out.println(y);
			y++;
		}while(y<5);
    
	}
}
