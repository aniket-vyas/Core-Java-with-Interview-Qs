/*
 *		"throws" KEYWORD :-
 *
 * ~> it is applied on a method
 * ~> if any exception occur in a method then the exception will be passed on the
 * 		calling statement of a method
*/

import java.io.FileWriter;
import java.io.IOException;
public class A {
	public static void main(String[] args) throws IOException {
		A a1 = new A();
		a1.test();
	}
	public void test() throws IOException {
		FileWriter fw = new FileWriter("D://test.txt");
	}
}
