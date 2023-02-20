/*
 *		EXCEPTIONS :-
 *
 * ~> whenever a bad user input is given program executon
 * 		will halt updroply
 * ~> to handle exception we use try & catch block
 * ~> if any line of code in try block causes exception 
 * 		then try block will create exception object & the
 * 		object address it will give it to catch block
 * ~> catch block will now suppressed that exception &
 * 		further code will continue to run
*/

public class exceptions {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
		} catch (Exception e) {
		// e --> refrence variable of exception object
			System.out.println(e);
			// it will not print the object address
			// it will print exception message
		}
		System.out.println("welcome");
	}
}

/*
 *	TYPES OF EXCEPTION :-
 *
 * 1.) Compile Time Exception (checked exception) :
 * 		~> if any exception occurs when .java file is
 * 			converted to .class file
 * 
 * 2.) Run Time Exception (unchecked exception) :
 * 		~> if an exception occurs when you run 
 * 			.class file
*/
