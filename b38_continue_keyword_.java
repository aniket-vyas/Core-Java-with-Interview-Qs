/*
 *		"continue" KEYWORD :-
 *
 * ~> it is used to end the current iteration in a loop , 
 * 		and continues to the next iteration.
*/
public class continue_keyword {
	public static void main(String[] args) {
		
		for(int i = 0 ; i<5 ; i++) {
			if(i == 2) { 		//2 == 2 --> true 
				continue;  		//continue from for loop
			}
			System.out.println(i);
		}
		
	}
}
