/*
 *		REGULAR EXPRESSION :-
 *
 * ~> it help us to take validation
 * ~> it is a sequence of characters that forms a search pattern
 * 		when you search for a data in a text , you can use this search pattern to
 * 		describe what you are searching for
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class A {
	
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a6b#@29Dc");
		while(m.find()) {
			System.out.println(m.start() + "...." + m.group());
		}
		
	}
}
/*
 * [abc] --> searching this alpha in string
 * [a-z] --> all alpha b/w a to z
 * [0-9] --> all from b/w 0 to 9
 * [A-Z] --> all drom b/w A to Z
 * [a-zA-Z0-9] --> all from b/w a to z , A to Z , 0 to 9
 * [^a-z] --> other than a to z
 * [^a-zA-Z0-9] --> only special char
 * [@] --> you can also write special char
 * [0-9]{5} --> make group of 5 in b/w 0 to 9
 * \\s --> all white spaces
 * \\S --> other than white spaces
 * \\d --> digits in string
 * \\D --> other than digits in string
 * \\w --> it will give you upper , lower case char , digits
 * \\W --> it will give you other than upper , lower case char , digits
 * a* --> 0 occurrence & group of 'a' char
 * a+ --> it will give you only group of 'a' char
 * a? --> it will give you single occurrence of 'a' char
*/
