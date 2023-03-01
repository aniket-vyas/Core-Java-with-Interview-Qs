/*
 *		BufferedReader :-
 *
 * ~> read line by line in BufferedReader --> readLine()
 * ~> remove the loop and simply print ((char)br.read())
 * 		--> it will print only single latter of first line
*/
import java.io.BufferedReader;
import java.io.FileReader;
public class buffered_reader {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D://test_reader.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i = 0 ; i<4 ; i++) {
				System.out.println(br.readLine());
			}
			//in txt file there are nothing in remaing 3 lines
			//then it will show nothing
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
