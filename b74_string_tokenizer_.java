/*
 *		STRING TOKENIZER :-
 *
 * ~> the java.util.StringTokenizer class allows you to break a String into tokens
*/

import java.util.StringTokenizer;
public class A {
	public static void main(String[] args) {
    
		StringTokenizer str1 = new StringTokenizer("Aniket Vyas");
		System.out.println(str1); // it will print memory add
		
		int count = str1.countTokens();
		System.out.println(count); // it will print no of tokens
		
		StringTokenizer str2 = new StringTokenizer("Ani:Ani:Ani" , ":");
		// it means break the string when see this ":"
		
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken()); // it will print tokens
		}
    
	}
}
