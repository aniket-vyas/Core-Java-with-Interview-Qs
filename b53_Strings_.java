/*
 *		STRING :- 
*/

import java.util.Scanner;
public class String_ {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = scan.nextLine();
		
		//what char @index
		System.out.println("Char @2 index : " + str.charAt(2));
		
		//length of string
		System.out.println("Length is : " + str.length());
		
		//reverse a string
		System.out.print("Reverse of string : ");
		for(int i = str.length()-1 ; i>=0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\n");
		
		//convert to upper & lower case 
		System.out.println("Lower case : " + str.toLowerCase());
		System.out.println("Upper case : " + str.toUpperCase());
		
		//some boolean value : for str = "Aniket Vyas"
		System.out.println(str.startsWith("a"));	//false
		System.out.println(str.startsWith("A"));	//true
		System.out.println(str.endsWith("a"));		//false
		System.out.println(str.endsWith("s"));		//true
		
		//convert int , double , char , boolean , char[] --to--> string
		int i = 20;
		String str1 = String.valueOf(i);
		System.out.println("convert int to string : " + str1);
		
		//count no. of words
		System.out.print("No. of words are : ");
		String[] s1 = str.trim().split(" ");
		System.out.println(s1.length);
		
		//print all words in a string
		System.out.println("String words are : ");
		for(String x : s1) {
			System.out.println(x);
		}
	}
}
