/*
 *		DESERIALIZATION :-
*/

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserialization {
	public static void main(String[] args) {
		try {
			FileInputStream fos = new FileInputStream("D://test_reader.ser");
			ObjectInputStream oos = new ObjectInputStream(fos);
			S_and_D a = (S_and_D)oos.readObject(); //class down casting
			System.out.println(a.city);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
