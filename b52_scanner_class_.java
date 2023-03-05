/*
 *		SCANNER CLASS :-
 *
 * ~> it is a java user input
 * ~> it is use to get user input & it is found in java.util package
 * ~> to use the scanner class & use as user input
*/

import java.util.Scanner;
public class scanner_class {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String x1 = scan.next();	//default String
		
		System.out.println("Enter your age : ");
		int x2 = scan.nextInt();	//integer value
		
		System.out.println("Enter your weight : ");
		float x3 = scan.nextFloat();	//decimal value
		
    //print the values
		System.out.println("Name is : " + x1);
		System.out.println("Age is : " + x2);
		System.out.println("Weight is : " + x3);
	}
}
