/*
 *		FILE HANDLING :-
 *
 * ~> in java is define as reading & writing data to a file
 * ~> the particular file class from the package called java.io
 * 		allows us to handle & work with different formats of file
 * 		
 * 		1.) File
 * 		2.) FileReader
 * 		3.) FileWriter
 * 		4.) BufferedReader
 * 		5.) BufferedWriter
 * 		6.) FileInputStream
 * 		7.) FileOutputStream
*/

import java.io.File;
import java.io.IOException;
public class file_handling {
	public static void main(String[] args) {
		
		//it will not check the path is correct or not
		File f = new File("D://new.txt");
		
		//it will print the path
		System.out.println(f);
		
		//how to check the path is correct or not
		boolean val = f.exists();
		System.out.println(val); //false --> wrong path
		
		//how to calculate number of char/length
		long val1 = f.length();
		System.out.println(val1); //print length
				
		//how to check file is deleted or not
		boolean val2 = f.delete();
		System.out.println(val2); //false
		
		//create a new file ( non static() )
		File ff = new File("D://test1.txt");
		try {
			boolean val3 = ff.createNewFile();
			System.out.println(val3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//how to create a folder ( non static() )
		//true --> folder is created
		//false --> rerun the program
		File fo = new File("D://testFolder");
		boolean val4 = fo.mkdir();
		System.out.println(val4);
		
		//how to get all file & folder names
		File fifo = new File("D://Notes & Information");
		String[] names = fifo.list();
		for(String s : names) { //for each loop
			System.out.println(s);
		}
	}
}
