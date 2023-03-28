/*
 *		"throws" KEYWORD :-
 *
 * ~> it is applied on a method
 * ~> if any exception occur in a method then the exception will be passed on the
 * 		calling statement of a method
 * ~> after "throws" keyword you can give multiple class names
*/

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
public class throws_ {
	
	public static void main(String[] args) throws IOException, SQLException {
		throws_ a1 = new throws_();
		a1.test();
	}
	
	public void test() throws IOException, SQLException {
		
		//Don't worry of this code & enjoy learning
		FileWriter fw = new FileWriter("D://test.txt");
		DriverManager.getConnection(" "," "," ");
		
	}
}
