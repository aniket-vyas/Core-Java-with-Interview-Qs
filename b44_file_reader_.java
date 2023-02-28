/*
 *		FileReader :-
*/
import java.io.File;
import java.io.FileReader;
public class FileReader {
	public static void main(String[] args) {
		File f = new File("D://test_reader.txt");
		try {
			FileReader fr = new FileReader(f);
			char[] ch = new FileReader(f);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
