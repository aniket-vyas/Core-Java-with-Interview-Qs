/*
 *		BufferedWriter :-
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class buffered_writer {
	public static void main(String[] args) {
		try {
			FileWriter fr = new FileWriter("D://test.txt");
			BufferedWriter bw = new BufferedWriter(fr);
			
			//write into the file
			bw.write("mike");
			bw.write("ross");
			bw.newLine(); //in-built method
			bw.write("Aniket");
			
			//for save & close
			bw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
