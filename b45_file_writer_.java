/*
 *		FileWriter :-
 *
 * ~> it create a file in a given path if a file does't exist
 * ~> by default override the file
 * ~> if you don't want to override the file then create the file
 * 		writer object with boolean value 'true'
*/

import java.io.FileWriter;
import java.io.IOException;
public class File_Writer {
	public static void main(String[] args) {
		try {
			
			//it will create a new file
			FileWriter fr = new FileWriter("D://test_reader.txt" , true);
			
			//to write into a file
			fr.write(97); //a
			fr.write("mike"); //amike
			fr.write("97"); //amike97
			char[] ch = {'a' , 'b' , 'c'};
			fr.write(ch); //amike97abc
			
			//save & close
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
