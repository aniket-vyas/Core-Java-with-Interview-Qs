/*
 *		NAME VALIDATION :-
 *
 * ~> Example
 * 
 * 		I/P : Aniket
 * 		O/P : Input Accepted
 * 
 * 		I/P : Lol123@
 * 		O/P : Error
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class name_validation {
	public static void main(String[] args) {
		
		System.out.println("Enter your name : ");
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		int count = 0;
		
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			count ++;
		}
		
		if(count != 0 || str.length() < 3) {
			System.out.println("Error");
		}else {
			System.out.println("Input Accepted");
		}
	}
}
