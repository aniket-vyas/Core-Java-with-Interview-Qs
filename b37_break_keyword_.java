/*
 *		"break" KEYWORD :-
 *
 * ~> it can be used in loops , switch case.
*/
public class break_kayword {
	public static void main(String[] args) {
		
		System.out.println("Break keyword : ");
		for(int i = 0 ; i<5 ; i++) {
			if(i == 2) {
				break;
			}
			System.out.println(i);
		}
		
		/* 
    		 *   	 "labelled break" KEYWORD :-
		 * 
		 *  ~> we can control here what to exit.
		*/ 
		System.out.println("Labelled break keyword : ");
		a : for(int x = 0 ; x<5 ; x++) {
			if(x == 3) {
				break a; //it will exit for loop
			}
			System.out.println(x);
		}
	}
}
