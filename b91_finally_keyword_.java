/*
 *			"finally" KEYWORD :-
 *
 * ~> it is an extension of try / catch
 * ~> anything we write in the finally block regardless of exception
 * 		occurs or not any code we write in finally block will 100% work
 * 
 * Q. Can we write only try & finally block ?
 * 		~> Yes , but if exception occur outside of finally block code
 * 					will not work
 * 
 * ~> main usage : it is very usefull to close the database connection ,
 * 					close the file such code we can keep it in finally block
 * 
 * Q. Can I create try & multiple catch block ?
 * 		~> Yes , you can start with child name & followed by parent 
 * 					class name
*/
public class A {
	public static void main(String[] args) {
    
		try {
			int x = 10/0;
			System.out.println(x);  // ArithmeticException
			System.out.println(100);  // it will not work
      
		} catch (Exception e) {
			e.printStackTrace();
      
		} finally {
			//System.exit(0);  // stop forcefully finally block
			System.out.println(200);  // print --> 200
		}
    
	}
}
