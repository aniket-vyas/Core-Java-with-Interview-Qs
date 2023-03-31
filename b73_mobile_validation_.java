/*
 *		MOBILE NUMBER VALIDATION :- 
*/

import java.util.Scanner;
public class mobile_validation {
	public static void main(String[] args) {
		
		// User input
		System.out.println("Enter your mobile no. : ");
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		// Condition
		String regex = "[6-9][0-9]{9}";
		/*
		 *	[6-9] --> start with 6/7/8/9
		 *	[0-9] --> no. b/w 0 to 9
		 *	 {9}  --> group of 9
		 */
		
		if(str.matches(regex)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
